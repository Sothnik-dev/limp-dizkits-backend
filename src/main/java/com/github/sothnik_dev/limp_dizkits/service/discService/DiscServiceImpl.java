package com.github.sothnik_dev.limp_dizkits.service.discService;

import com.github.sothnik_dev.limp_dizkits.mapper.discMapper.DiscMapper;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import com.github.sothnik_dev.limp_dizkits.repository.discRepository.DiscRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class DiscServiceImpl implements  DiscService{
    private DiscRepository discRepository;
    private DiscMapper discMapper;

    @Override
    public DiscDto findDiscById(UUID id) {
        DiscModel disc = discRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id not found"));
        return discMapper.toDto(disc);
    }

    @Override
    public DiscDto createDisc(CreateDiscRequest request) {
        DiscModel disc = discMapper.toEntity(request);
        discRepository.save(disc);
        return discMapper.toDto(disc);
    }

    @Override
    public DiscDto updateDisc(UUID id, CreateDiscRequest request) {
        DiscModel disc = discRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Did not find the id"));
        discMapper.updateItem(disc, request);
        discRepository.save(disc);
        return discMapper.toDto(disc);
    }

    @Override
    public List<DiscDto> findAllDisc() {
        List<DiscModel> list = discRepository.findAll().stream().toList();
        return discMapper.toListDto(list);
    }

    @Override
    public void deleteDisc(UUID id) {
        DiscModel disc = discRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Id não encontrado"));
        discRepository.delete(disc);
    }
}

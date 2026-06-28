package com.github.sothnik_dev.limp_dizkits.service.discService;

import com.github.sothnik_dev.limp_dizkits.mapper.discMapper.DiscMapper;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import com.github.sothnik_dev.limp_dizkits.repository.discRepository.DiscRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
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
        return discMapper.toDto(disc);
    }

    @Override
    public void deleteDisc(UUID id) {
        discRepository.deleteById(id);
    }
}

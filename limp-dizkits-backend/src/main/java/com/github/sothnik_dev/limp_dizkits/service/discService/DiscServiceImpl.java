package com.github.sothnik_dev.limp_dizkits.service.discService;

import com.github.sothnik_dev.limp_dizkits.exception.discException.DiscNotFoundException;
import com.github.sothnik_dev.limp_dizkits.mapper.discMapper.DiscMapper;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import com.github.sothnik_dev.limp_dizkits.repository.discRepository.DiscRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
                .orElseThrow(() -> new DiscNotFoundException("We were'nt able to find the disc by the id, sorry",
                        HttpStatus.NOT_FOUND.value()
                    )
                );
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
                .orElseThrow(() -> new DiscNotFoundException(
                        "We were'nt able to find the disc by the id, we are not able to update, sorry",
                        HttpStatus.NOT_FOUND.value()
                        )
                );
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
                        .orElseThrow(() -> new DiscNotFoundException("We were'nt able to find the disc by the id, we cannot delete"
                        , HttpStatus.NOT_FOUND.value()
                                )
                        );
        discRepository.delete(disc);
    }
}

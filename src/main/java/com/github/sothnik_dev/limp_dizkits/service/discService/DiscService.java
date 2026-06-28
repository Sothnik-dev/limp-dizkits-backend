package com.github.sothnik_dev.limp_dizkits.service.discService;

import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public interface DiscService {
    DiscDto findDiscById(UUID id);
    DiscDto createDisc(CreateDiscRequest request);
    void deleteDisc(UUID id);
}

package com.github.sothnik_dev.limp_dizkits.mapper.discMapper;

import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import org.springframework.stereotype.Component;

@Component
public class DiscMapper {
    public DiscDto toDto(DiscModel disc) {
        DiscDto dto = new DiscDto();
        dto.setDiscId(disc.getDiscId());
        dto.setDiscTitle(disc.getDiscTitle());
        dto.setDiscDescription(disc.getDiscDescription());
        dto.setDiscValue(disc.getDiscValue());
        dto.setDiscImg(dto.getDiscImg());
        dto.setDiscDemoMsc(dto.getDiscDemoMsc());
        return dto;
    }

    public DiscModel toEntity(CreateDiscRequest request) {
        DiscModel disc = new DiscModel();
        disc.setDiscTitle(request.getDiscTitle());
        disc.setDiscDescription(request.getDiscDescription());
        disc.setDiscValue(request.getDiscPrice());
        disc.setDiscImage(request.getDiscImg());
        disc.setDiscDemoMusic(request.getDiscDemoMsc());

        return disc;
    }
}

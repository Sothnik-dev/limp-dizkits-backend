package com.github.sothnik_dev.limp_dizkits.mapper.discMapper;

import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DiscMapper {
    public DiscDto toDto(DiscModel disc) {
        DiscDto dto = new DiscDto();
        dto.setDiscId(disc.getDiscId());
        dto.setDiscTitle(disc.getDiscTitle());
        dto.setDiscDescription(disc.getDiscDescription());
        dto.setDiscValue(disc.getDiscValue());
        dto.setDiscImage(disc.getDiscImage());
        dto.setDiscDemoMusic(disc.getDiscDemoMusic());
        return dto;
    }

    public DiscModel toEntity(CreateDiscRequest request) {
        DiscModel disc = new DiscModel();
        disc.setDiscTitle(request.getDiscTitle());
        disc.setDiscDescription(request.getDiscDescription());
        disc.setDiscValue(request.getDiscValue());
        disc.setDiscImage(request.getDiscImage());
        disc.setDiscDemoMusic(request.getDiscDemoMusic());

        return disc;
    }

    public List<DiscDto> toListDto(List<DiscModel> list) {
        List<DiscDto> dtoList = new ArrayList<>();
        list.forEach((i) -> {
            dtoList.add(toDto(i));
        });

        return dtoList;
    }

    public void updateItem(DiscModel disc, CreateDiscRequest request) {
        disc.setDiscTitle(request.getDiscTitle());
        disc.setDiscDescription(request.getDiscDescription());
        disc.setDiscValue(request.getDiscValue());
        disc.setDiscImage(request.getDiscImage());
        disc.setDiscDemoMusic(request.getDiscDemoMusic());
    }
}

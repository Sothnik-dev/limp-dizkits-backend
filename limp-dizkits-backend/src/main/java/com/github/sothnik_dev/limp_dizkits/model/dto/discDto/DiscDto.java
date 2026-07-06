package com.github.sothnik_dev.limp_dizkits.model.dto.discDto;

import com.github.sothnik_dev.limp_dizkits.model.entity.discEntity.DiscModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiscDto {
    private UUID discId;
    private String discTitle;
    private String discDescription;
    private double discValue;
    private int discAmount;
    private List<String> discTags;
    private String discImage;
    private String discDemoMusic;
}



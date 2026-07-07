package com.github.sothnik_dev.limp_dizkits.model.dto.discDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CreateDiscRequest {
    private String discTitle;
    private String discDescription;
    private double discValue;
    private int discAmount;
    private List<String> discTags;
    private String discImage;
    private String discDemoMusic;
}

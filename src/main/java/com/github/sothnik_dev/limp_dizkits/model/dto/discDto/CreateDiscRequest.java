package com.github.sothnik_dev.limp_dizkits.model.dto.discDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateDiscRequest {
    private String discTitle;
    private String discDescription;
    private double discValue;
    private String discImage;
    private String discDemoMusic;
}

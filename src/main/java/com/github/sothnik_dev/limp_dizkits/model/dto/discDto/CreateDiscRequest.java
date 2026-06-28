package com.github.sothnik_dev.limp_dizkits.model.dto.discDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class CreateDiscRequest {
    private String discTitle;
    private String discDescription;
    private double discPrice;
    private String discImg;
    private String discDemoMsc;
}

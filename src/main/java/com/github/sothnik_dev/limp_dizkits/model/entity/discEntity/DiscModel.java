package com.github.sothnik_dev.limp_dizkits.model.entity.discEntity;

import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "disc")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiscModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID discId;

    @Column(nullable = false )
    private String discTitle;
    @Column(nullable = false )
    private String discDescription;
    @Column(nullable = false )
    private double discValue;
    @Column(nullable = false )
    private String discImage;
    @Column
    private String discDemoMusic;

    public DiscModel(CreateDiscRequest request) {
        DiscModel disc = new DiscModel();
        disc.setDiscTitle(request.getDiscTitle());
        disc.setDiscDescription(request.getDiscDescription());
        disc.setDiscValue(request.getDiscValue());
        disc.setDiscImage(request.getDiscImage());
        disc.setDiscDemoMusic(request.getDiscDemoMusic());
    }
}

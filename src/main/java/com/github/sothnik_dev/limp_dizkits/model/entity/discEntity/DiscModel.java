package com.github.sothnik_dev.limp_dizkits.model.entity.discEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
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
    @Column(nullable = false)
    private double discValue;
    @Column(nullable = false )
    private int discAmount;
    @Column(nullable = false)
    private List<String> discTags;
    @Column(nullable = false )
    private String discImage;
    @Column
    private String discDemoMusic;
}

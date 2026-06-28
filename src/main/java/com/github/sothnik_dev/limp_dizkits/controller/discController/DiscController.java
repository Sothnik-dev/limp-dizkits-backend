package com.github.sothnik_dev.limp_dizkits.controller.discController;

import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.CreateDiscRequest;
import com.github.sothnik_dev.limp_dizkits.model.dto.discDto.DiscDto;
import com.github.sothnik_dev.limp_dizkits.service.discService.DiscService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/disc")
public class DiscController {

    private final DiscService discService;

    public DiscController(DiscService discService) {
        this.discService = discService;
    }

    @GetMapping("/disc/{id}")
    public ResponseEntity<DiscDto> getDisc(@PathVariable UUID id) {
        return ResponseEntity.ok(discService.findDiscById(id));
    }

    @PostMapping("/disc/create")
    public ResponseEntity<DiscDto> postDisc(CreateDiscRequest request){
        return ResponseEntity.ok(discService.createDisc(request));
    }

    @DeleteMapping("disc/delete")
    public void deleteDisc(UUID id){
        discService.deleteDisc(id);
    }
}

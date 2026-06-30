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

    @GetMapping("/find/{id}")
    public ResponseEntity<DiscDto> getDisc(@PathVariable UUID id) {
        return ResponseEntity.ok(discService.findDiscById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<DiscDto>> getAllDisc() {
        return ResponseEntity.ok(discService.findAllDisc());
    }

    @PostMapping("/create")
    public ResponseEntity<DiscDto> postDisc(@RequestBody CreateDiscRequest request){
        return ResponseEntity.ok(discService.createDisc(request));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<DiscDto> putDisc(@PathVariable UUID id, @RequestBody CreateDiscRequest request) {
        return ResponseEntity.ok(discService.updateDisc(id, request));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDisc(@PathVariable UUID id){
        discService.deleteDisc(id);
    }
}
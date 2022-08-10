package com.example.demo.controller;

import com.example.demo.dto.LegalPersonDto;
import com.example.demo.service.LegalPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/legal-person")
@RequiredArgsConstructor
public class LegalPersonController {

    private final LegalPersonService service;

    @GetMapping
    public ResponseEntity<LegalPersonDto> get(
            @RequestParam(name = "tipo") String type,
            @RequestParam(name = "ruc") String ruc) {
        LegalPersonDto dto = service.get(type, ruc);
        return dto != null
                ? ResponseEntity.ok(dto)
                : ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<LegalPersonDto>> getAll() {
        return ResponseEntity.ok()
                .body(service.getAll());
    }

    @PostMapping
    public ResponseEntity<LegalPersonDto> save(@RequestBody LegalPersonDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.save(dto));
    }

}

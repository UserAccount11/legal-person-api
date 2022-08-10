package com.example.demo.service;

import com.example.demo.client.LegalPersonRestClient;
import com.example.demo.dto.LegalPersonDto;
import com.example.demo.mapper.LegalPersonMapper;
import com.example.demo.model.LegalPerson;
import com.example.demo.repository.LegalPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LegalPersonService {

    private final LegalPersonMapper mapper;
    private final LegalPersonRepository repository;
    private final LegalPersonRestClient restClient;

    public LegalPersonDto get(String type, String ruc) {
        return restClient.getLegalPersonDto(type, ruc);
    }

    public List<LegalPersonDto> getAll() {
        return repository.findAll().stream()
                .map(mapper::toLegalPersonDto)
                .collect(Collectors.toList());
    }

    public LegalPersonDto save(LegalPersonDto dto) {
        LegalPerson legalPerson = mapper.toLegalPerson(dto);
        return mapper.toLegalPersonDto(repository.save(legalPerson));
    }

}

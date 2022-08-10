package com.example.demo.mapper;

import com.example.demo.dto.LegalPersonDto;
import com.example.demo.model.LegalPerson;
import org.springframework.stereotype.Component;

@Component
public class LegalPersonMapper {

    public LegalPersonDto toLegalPersonDto(LegalPerson legalPerson) {
        return LegalPersonDto.builder()
                .ruc(legalPerson.getRuc())
                .razon_social(legalPerson.getBusinessName())
                .estado(legalPerson.getState())
                .direccion(legalPerson.getDirection())
                .ubigeo(legalPerson.getUbigeo())
                .departamento(legalPerson.getDepartment())
                .provincia(legalPerson.getProvince())
                .distrito(legalPerson.getDistrict())
                .build();
    }
    public LegalPerson toLegalPerson(LegalPersonDto dto) {
        return LegalPerson.builder()
                .ruc(dto.getRuc())
                .businessName(dto.getRazon_social())
                .state(dto.getEstado())
                .direction(dto.getDireccion())
                .ubigeo(dto.getUbigeo())
                .department(dto.getDepartamento())
                .province(dto.getProvincia())
                .district(dto.getDistrito())
                .build();
    }

}

package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "legal_person")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LegalPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ruc;
    @Column(name = "business_name")
    private String businessName;
    private String state;
    private String direction;
    private String ubigeo;
    private String department;
    private String province;
    private String district;

}

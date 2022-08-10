package com.example.demo.repository;

import com.example.demo.model.LegalPerson;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LegalPersonRepository extends JpaRepository<LegalPerson, Long> {
}

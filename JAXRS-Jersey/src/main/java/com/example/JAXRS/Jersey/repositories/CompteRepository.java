package com.example.JAXRS.Jersey.repositories;

import com.example.JAXRS.Jersey.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
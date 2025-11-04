package com.example.JAXRS.Jersey;

import com.example.JAXRS.Jersey.entities.Compte;
import com.example.JAXRS.Jersey.entities.TypeCompte;
import com.example.JAXRS.Jersey.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MsBanqueApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsBanqueApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository) {
        return args -> {
            // ✅ plus besoin de "null", car l'id est généré automatiquement
            compteRepository.save(new Compte(Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(Math.random() * 9000, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(Math.random() * 9000, new Date(), TypeCompte.EPARGNE));

            compteRepository.findAll().forEach(System.out::println);
        };
    }
}

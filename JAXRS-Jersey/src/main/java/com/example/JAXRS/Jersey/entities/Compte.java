package com.example.JAXRS.Jersey.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Compte {
    // Ton code existant : id, solde, dateCreation, type



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type;

    public Compte() {} // requis par JPA

    public Compte(double solde, Date dateCreation, TypeCompte type) {
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getSolde() { return solde; }
    public void setSolde(double solde) { this.solde = solde; }

    public Date getDateCreation() { return dateCreation; }
    public void setDateCreation(Date dateCreation) { this.dateCreation = dateCreation; }

    public TypeCompte getType() { return type; }
    public void setType(TypeCompte type) { this.type = type; }
}

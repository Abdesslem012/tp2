package com.example.tp2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Universite {
    @Id
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    public Universite() {

    }
    public Long getIdUniversite() {
        return idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}

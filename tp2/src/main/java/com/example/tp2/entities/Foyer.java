package com.example.tp2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Foyer {
    @Id
    private Long idFoyer;
    private String nomFoyer;
    private String CapaciteFoyer;

    public Foyer() {

    }

    public Long getIdFoyer() {
        return idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public String getCapaciteFoyer() {
        return CapaciteFoyer;
    }

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setCapaciteFoyer(String capaciteFoyer) {
        CapaciteFoyer = capaciteFoyer;
    }
}

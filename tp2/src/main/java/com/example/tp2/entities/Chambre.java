package com.example.tp2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Chambre {
    @Id
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    public Chambre() {

    }

    public Long getIdChambre() {
        return idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
}

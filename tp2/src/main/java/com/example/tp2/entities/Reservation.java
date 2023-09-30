package com.example.tp2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
public class Reservation {
    @Id
    private Long idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private Boolean estValide;

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Long getIdReservation() {
        return idReservation;
    }
}

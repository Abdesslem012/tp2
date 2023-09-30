package com.example.tp2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bloc {
    @Id
    private Long idBloc;
    private String nameBloc;
    private String capacitesBloc;

    public Bloc() {

    }

    public Long getIdBloc() {
        return idBloc;
    }

    public String getNameBloc() {
        return nameBloc;
    }

    public String getCapacitesBloc() {
        return capacitesBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public void setNameBloc(String nameBloc) {
        this.nameBloc = nameBloc;
    }

    public void setCapacitesBloc(String capacitesBloc) {
        this.capacitesBloc = capacitesBloc;
    }
}

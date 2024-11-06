package com.kpanuiczka.kiki.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Biere {
    @Id
    private Long id;
    private String nom;
    private String brasserie;
    @Enumerated(EnumType.STRING)
    private TypeBiere TypeBiere;
    private float degreAlcool;

    public Biere() {
    }

    // Getteur

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getBrasserie() {
        return brasserie;
    }

    public TypeBiere getTypeBiere() {
        return TypeBiere;
    }

    public float getDegreAlcool() {
        return degreAlcool;
    }

    // Setteur

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBrasserie(String brasserie) {
        this.brasserie = brasserie;
    }

    public void setTypeBiere(TypeBiere typeBiere) {
        this.TypeBiere = typeBiere;
    }

    public void setDegreAlcool(float degreAlcool) {
        this.degreAlcool = degreAlcool;
    }

    @Override
    public String toString() {
        return this.nom + " " + this.TypeBiere + " de la brasserie " + this.brasserie + " (" + this.degreAlcool + "°)";
    }

    
}
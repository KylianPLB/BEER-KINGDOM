package com.kpanuiczka.kiki.service;

import com.kpanuiczka.kiki.entities.Biere;
import java.util.List;
import java.util.Optional;

public interface IBieresService {
    public List<Biere> getAllBieres();
    public Optional<Biere> getBiereById(Long id);
    public void ajouterBiere(Biere b);
    public void supprimerBiere(Long id);
    public void modifierBiere(Long id, Biere b);
}

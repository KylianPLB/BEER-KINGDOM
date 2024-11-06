package com.kpanuiczka.kiki.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpanuiczka.kiki.entities.Biere;
import com.kpanuiczka.kiki.repositories.BieresRepository;

@Service
public class BieresService implements IBieresService {
    @Autowired
    private BieresRepository bieresRepository;

    @Override
    public List<Biere> getAllBieres() {
        return bieresRepository.findAll();
    }

    @Override
    public Optional<Biere> getBiereById(Long id) {
        return bieresRepository.findById(id);
    }

    @Override
    public void ajouterBiere(Biere b) {
        bieresRepository.save(b);
        System.out.println("Biere ajoutée avec succès");
    }

    @Override
    public void supprimerBiere(Long id) {
        bieresRepository.deleteById(id);
        System.out.println("Biere supprimée avec succès");
    }

    @Override
    public void modifierBiere(Long id, Biere b) {
        Optional<Biere> biere = bieresRepository.findById(id);
        if (biere.isPresent()) {
            Biere biereToUpdate = biere.get();
            biereToUpdate.setNom(b.getNom());
            biereToUpdate.setBrasserie(b.getBrasserie());
            biereToUpdate.setTypeBiere(b.getTypeBiere());
            biereToUpdate.setDegreAlcool(b.getDegreAlcool());
            bieresRepository.save(biereToUpdate);
            System.out.println("Biere modifiée avec succès");
        } else {
            System.out.println("Biere non trouvée");
        }
    }
}

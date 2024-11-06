package com.kpanuiczka.kiki.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kpanuiczka.kiki.entities.Biere;

@Repository
public interface BieresRepository extends JpaRepository<Biere, Long> {
    
}
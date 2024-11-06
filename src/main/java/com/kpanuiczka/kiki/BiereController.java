package com.kpanuiczka.kiki;

import org.springframework.web.bind.annotation.RestController;

import com.kpanuiczka.kiki.entities.Biere;
import com.kpanuiczka.kiki.service.BieresService;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import com.kpanuiczka.kiki.entities.Biere;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/biere")
public class BiereController {
    @Autowired
    private BieresService bieresService;

    @GetMapping("/getBieres")
    public List<Biere> getAllBiere() {
        return bieresService.getAllBieres();
    }

    @GetMapping("/getBiereById/{id}")
    public String getMethodName(@PathVariable Long id) {
        return bieresService.getBiereById(id).toString();
    }

    @PostMapping("/ajouterBiere")
    public void ajouterUneBiere(@RequestBody Biere biereJSON) {
        bieresService.ajouterBiere(biereJSON);
    }

    @GetMapping("/supprimerBiere/{id}")
    public void supprimerBiere(@PathVariable Long id) {
        bieresService.supprimerBiere(id);
    }

    @PostMapping("/modifierBiere/{id}")
    public void modifierBiere(@PathVariable Long id, @RequestBody Biere biereJSON) {
        bieresService.modifierBiere(id, biereJSON);
    }
    
    
    

    // @GetMapping("/ajouterBiere")
    // public String ajouterUneBiere(@PathVariable String nom, @PathVariable String brasserie, @PathVariable String type, @PathVariable float degre) {
    //     Biere biereAjoute = new Biere(1,nom, brasserie, type, degre);
    //     return biereAjoute.getString();        
    // }
}

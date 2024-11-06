package com.kpanuiczka.kiki.views;

import com.kpanuiczka.kiki.entities.Biere;
import com.kpanuiczka.kiki.service.BieresService;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Ajouter une bière")
@Route(value = "addBear")
@CssImport("styles/styles.css")
public class addBear {
    private BieresService bieresService;

    public addBear(BieresService bieresService) {
        this.bieresService = bieresService;

    }

}

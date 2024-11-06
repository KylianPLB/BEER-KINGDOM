package com.kpanuiczka.kiki.views;

import org.springframework.beans.factory.annotation.Autowired;

import com.kpanuiczka.kiki.entities.Biere;
import com.kpanuiczka.kiki.service.BieresService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Kiki")
@Route(value = "app/")
@CssImport("styles/styles.css")
public class mainView extends VerticalLayout {
    private BieresService bieresService;
    private HorizontalLayout hlHeader;

    public mainView(@Autowired BieresService bieresService) {
        loadHeader();

        // this.bieresService = bieresService;
        // H3 h3 = new H3("Le Bar");
        // Button button = new Button("Oui");
        // Button buttonNon = new Button("Non");
        // HorizontalLayout hlButtonContainer = new HorizontalLayout();
        // hlButtonContainer.add(button, buttonNon);
        // ListBox<Biere> lbBieres = new ListBox<>();
        // lbBieres.setItems(bieresService.getAllBieres());
        // this.add(h3, lbBieres, hlButtonContainer);

        Grid<Biere> gridBieres = new Grid<>(Biere.class);
        gridBieres.setItems(bieresService.getAllBieres());
        gridBieres.setColumns("id", "nom", "brasserie", "typeBiere", "degreAlcool");
        this.add(gridBieres);
    }

    private void loadHeader() {
        hlHeader = new HorizontalLayout();
        hlHeader.addClassName("header-container");
        HorizontalLayout hlHeaderButtonContainer = new HorizontalLayout();
        hlHeaderButtonContainer.addClassName("header-button-container");
        Button headerButtonListBear = new Button("Le Bar");
        Button headerButtonNewBear = new Button("Ajouter une bière");
        headerButtonNewBear.addClickListener(e -> {
            headerButtonNewBear.getUI().ifPresent(ui -> ui.navigate("addBear"));
        });
        hlHeaderButtonContainer.add(headerButtonListBear, headerButtonNewBear);
        hlHeader.add(new H3("BEER KINGDOM"), hlHeaderButtonContainer);
        this.add(hlHeader);
    }

    // private void refreshList(ListBox<Biere> lbBieres) {
    // lbBieres.setItems(bieresService.getAllBieres());
    // }
}

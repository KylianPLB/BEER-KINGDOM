package com.kpanuiczka.kiki.fonction;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class fonctionGeneral {

    public void loadHeader(VerticalLayout container,HorizontalLayout hlHeader) {
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
        container.add(hlHeader);
    }
    
}

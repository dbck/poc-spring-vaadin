package de.dbck.poc.pocspringvaadin;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import de.dbck.poc.pocspringvaadin.backend.entity.Company;
import de.dbck.poc.pocspringvaadin.backend.entity.Contact;
import de.dbck.poc.pocspringvaadin.backend.service.ContactService;

@Route("")
//@Theme(value=Material.class, variant = Material.DARK)
//@Theme(value=Lumo.class, variant = Lumo.LIGHT)
public class MainView extends VerticalLayout {
  private static final long serialVersionUID = 1L;

  private ContactService contactService;
  private Grid<Contact> grid = new Grid<>(Contact.class);
  private TextField filterText = new TextField();

  public MainView(ContactService contactService) {
    this.contactService = contactService;
    addClassName("list-view");
    setSizeFull();
    configureFilter();
    configureGrid();
    add(filterText, grid);
    add(grid);
    updateList();
  }

  private void configureFilter() {
    filterText.setPlaceholder("Filter by name...");
    filterText.setClearButtonVisible(true);
    filterText.setValueChangeMode(ValueChangeMode.LAZY);
    filterText.addValueChangeListener(e -> updateList());
  }

  private void configureGrid() {
    grid.addClassName("contact-grid");
    grid.setSizeFull();
    grid.removeColumnByKey("company");
    grid.setColumns("firstName", "lastName", "email", "status");
    grid.addColumn(contact -> {
      Company company = contact.getCompany();
      return company == null ? "-" : company.getName();
    }).setHeader("Company");
    grid.getColumns().forEach(col -> col.setAutoWidth(true));
  }

  private void updateList() {
    grid.setItems(contactService.findAll(filterText.getValue()));
  }

}


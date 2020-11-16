package de.dbck.poc.pocspringvaadin;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {
  private static final long serialVersionUID = 1L;

  public MainView() {
    add(new Text("Welcome to MainView."));
    Button button = new Button("I'm a button");
    
    button.addClickListener(clickEvent -> add(new Text("Clicked!")));
    
    HorizontalLayout layout = new HorizontalLayout(button, new DatePicker("Pick a date"));
    layout.setDefaultVerticalComponentAlignment(Alignment.END);
    add(layout);
  }

}


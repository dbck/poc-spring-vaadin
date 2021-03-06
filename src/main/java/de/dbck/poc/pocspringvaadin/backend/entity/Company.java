package de.dbck.poc.pocspringvaadin.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Company extends AbstractEntity {
  private String name;

  @JsonBackReference
  @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
  private List<Contact> employees = new LinkedList<>();

  public Company() {
  }

  public Company(String name) {
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Contact> getEmployees() {
    return employees;
  }
}

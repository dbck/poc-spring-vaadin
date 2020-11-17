package de.dbck.poc.pocspringvaadin.backend.controller.api;

import de.dbck.poc.pocspringvaadin.backend.entity.Contact;
import de.dbck.poc.pocspringvaadin.backend.service.ContactService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

  private ContactService contactService;

  public ContactController(ContactService contactService) {
    this.contactService = contactService;
  }

  @GetMapping
  public List<Contact> searchContact(@RequestParam(required = false) String filter) {
    return contactService.findAll(filter);
  }
}

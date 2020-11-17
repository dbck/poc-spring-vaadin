package de.dbck.poc.pocspringvaadin.backend.repository;

import de.dbck.poc.pocspringvaadin.backend.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}

package de.dbck.poc.pocspringvaadin.backend.repository;

import de.dbck.poc.pocspringvaadin.backend.entity.Contact;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

  @Query("select c from Contact c "
      + "where lower(c.firstName) like lower(concat('%', :searchTerm, '%')) "
      + "or lower(c.lastName) like lower(concat('%', :searchTerm, '%'))")
  List<Contact> search(@Param("searchTerm") String searchTerm);
}

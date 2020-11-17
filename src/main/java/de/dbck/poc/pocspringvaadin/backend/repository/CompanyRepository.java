package de.dbck.poc.pocspringvaadin.backend.repository;

import de.dbck.poc.pocspringvaadin.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
package de.dbck.poc.pocspringvaadin.backend.service;

import de.dbck.poc.pocspringvaadin.backend.entity.Company;
import de.dbck.poc.pocspringvaadin.backend.repository.CompanyRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

  private CompanyRepository companyRepository;

  public CompanyService(CompanyRepository companyRepository) {
    this.companyRepository = companyRepository;
  }

  public List<Company> findAll() {
    return companyRepository.findAll();
  }

}

package com.va.companyms.company.service;

import com.va.companyms.company.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    
    List<Company> findAll();

    Optional<Company> findById(Long id);

    Company createCompany(Company company);

    Company updateCompany(Long id, Company company);

    Optional<Company> deleteCompany(Long id);
}

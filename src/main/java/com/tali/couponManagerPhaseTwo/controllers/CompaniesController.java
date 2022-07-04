package com.tali.couponManagerPhaseTwo.controllers;

import com.tali.couponManagerPhaseTwo.dtos.Company;
import com.tali.couponManagerPhaseTwo.logic.CompaniesLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompaniesController {

    @Autowired
    private CompaniesLogic companiesLogic;

    @PostMapping
    public long createCompany(@RequestBody Company company) {
        long companyId = companiesLogic.createCompany(company);
        return companyId;
    }

    @PutMapping
    public void updateCompany(@RequestBody Company company) {
        companiesLogic.updateCompany(company);
    }

    @DeleteMapping("/{companyId}")
    public void deleteCompany(@PathVariable("companyId") long companyId) {
        companiesLogic.deleteCompany(companyId);
    }

    @GetMapping("/{companyId}")
    public Company getCompanyById(@PathVariable("companyId") long companyId) {
        return companiesLogic.getCompanyById(companyId);
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companiesLogic.getAllCompanies();
    }

    @GetMapping("/byName")
    public Company getCompanyByName(@RequestParam(name = "name") String name) {
        return companiesLogic.getCompanyByName(name);
    }
}

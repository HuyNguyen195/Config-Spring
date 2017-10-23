package com.fsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.entities.Company;

@Repository
public interface CompanyDAO extends JpaRepository<Company, Integer>{

}

package com.startup.distsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.distsystem.models.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}

package com.startup.distsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.distsystem.models.Retailer;

@Repository
public interface RetailerRepository extends JpaRepository<Retailer, String> {

}

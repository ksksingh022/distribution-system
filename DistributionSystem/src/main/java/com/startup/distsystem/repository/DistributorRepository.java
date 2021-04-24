package com.startup.distsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.distsystem.models.Distributor;

@Repository
public interface DistributorRepository extends JpaRepository<Distributor, String> {

}

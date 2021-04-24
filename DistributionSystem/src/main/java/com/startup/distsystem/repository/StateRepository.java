package com.startup.distsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.distsystem.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}

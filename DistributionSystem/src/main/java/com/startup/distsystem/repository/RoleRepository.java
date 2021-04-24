package com.startup.distsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.distsystem.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Byte> {

}

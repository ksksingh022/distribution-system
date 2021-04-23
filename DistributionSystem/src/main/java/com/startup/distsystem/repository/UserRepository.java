package com.startup.distsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.startup.distsystem.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
}

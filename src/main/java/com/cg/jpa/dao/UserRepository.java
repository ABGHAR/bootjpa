package com.cg.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.jpa.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	

}

package com.luigisoares.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luigisoares.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

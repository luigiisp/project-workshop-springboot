package com.luigisoares.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luigisoares.project.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

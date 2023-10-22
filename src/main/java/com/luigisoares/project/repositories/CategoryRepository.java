package com.luigisoares.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luigisoares.project.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

package com.simplilearn.SportyShoesProject.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.SportyShoesProject.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
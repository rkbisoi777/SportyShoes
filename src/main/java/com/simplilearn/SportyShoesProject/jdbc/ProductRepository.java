package com.simplilearn.SportyShoesProject.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.SportyShoesProject.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}

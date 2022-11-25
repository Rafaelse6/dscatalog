package com.devsuperior.dscatalog.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

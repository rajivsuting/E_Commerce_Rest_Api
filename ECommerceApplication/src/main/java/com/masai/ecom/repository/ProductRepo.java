package com.masai.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.ecom.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

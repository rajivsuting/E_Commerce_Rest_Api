package com.masai.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.ecom.entity.Cart;


@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

}

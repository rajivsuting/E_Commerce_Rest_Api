package com.masai.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.ecom.entity.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer> {

}

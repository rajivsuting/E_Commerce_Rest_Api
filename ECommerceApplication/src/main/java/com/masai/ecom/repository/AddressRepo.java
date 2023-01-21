package com.masai.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.ecom.entity.Address;


@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}

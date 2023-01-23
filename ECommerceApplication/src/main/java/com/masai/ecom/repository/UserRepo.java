package com.masai.ecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.ecom.entity.UserModel;


@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {
	
    public Optional<UserModel> findByEmail(String email);

    public boolean existsByEmail(String email);

}

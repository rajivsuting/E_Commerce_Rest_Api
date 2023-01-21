package com.masai.ecom.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Role> roles = new ArrayList<>();
	
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Orders> orders = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Address> address = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Cart cart;

}

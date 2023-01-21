package com.masai.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class OrderedProductQuantity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	private Product product;
	
	private Integer quantity;

	public OrderedProductQuantity(Product product, Integer quantity) {
		super();

		this.product = product;
		this.quantity = quantity;
	}
	
	
	

}

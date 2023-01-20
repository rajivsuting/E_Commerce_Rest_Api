package com.masai.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductQuantity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productQuantityId;
	
	@ManyToOne
	private Product product;
	
	@Min(value = 1)
	private Integer quantity;
	

}

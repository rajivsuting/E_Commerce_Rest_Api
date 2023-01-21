package com.masai.ecom.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Orders {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	private LocalDateTime orderDateTime; 
	
	@ManyToOne
	@JsonIgnore
	private UserModel user;
	
	@OneToOne
	private Address oddress;
	
    @Pattern(regexp = "^(Placed | Shipped | OutForDelivery | Delivered | Failed)")
    private String orderStatus;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderedProductQuantity> products = new ArrayList<>();
    
    

}

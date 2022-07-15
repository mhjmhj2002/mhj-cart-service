package com.mhj.cart.service.entity;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Product {
	
	@NonNull
	private Long id;
	
	@NonNull
    private String name;
	
	@NonNull
    private Double basePrice;
	
	@NonNull
    private Integer quantity;
	
    private Double totlalPrice;

}

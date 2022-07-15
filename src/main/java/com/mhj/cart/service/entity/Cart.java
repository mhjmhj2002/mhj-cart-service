package com.mhj.cart.service.entity;

import java.util.List;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Cart {

	@NonNull
	private Integer totaltems;
	
	@NonNull
    private Double totalPrice;

	@NonNull
    List<Product>products;
	
}

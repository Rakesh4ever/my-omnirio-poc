/**
 * 
 */
package com.omnirio.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omnirio.poc.model.Products;
import com.omnirio.poc.repo.ProductRepo;

/**
 * @author rkumar
 *
 */

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	public void saveEntiryData(Products product) {
		
		productRepo.save(product);	
	}

	public Products getProduct(String id) {
	return	productRepo.getById(id);
		
	}

}

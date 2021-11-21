/**
 * 
 */
package com.omnirio.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omnirio.poc.model.Products;
import com.omnirio.poc.service.ProductService;

/**
 * @author rkumar
 *
 */


@RestController
@RequestMapping("/omni/v1")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/geProduct/{Id}")
	public Products getProductById(@PathVariable String Id) {
		
		return productService.getProduct(Id);
	}
	
	@PostMapping("/persist")
	public String saveEntity(@RequestBody Products product) {
		productService.saveEntiryData(product);
		return "Successfully saved::::";
	}
}

/**
 * 
 */
package com.omnirio.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omnirio.poc.model.Products;

/**
 * @author rkumar
 *
 */

@Repository
public interface ProductRepo extends JpaRepository<Products, String> {
	

}

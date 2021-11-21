/**
 * 
 */
package com.omnirio.poc.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author rkumar
 *
 */

@Entity
@Table(name = "product")
public class Products  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	
	@GenericGenerator(name = "productid", strategy = "com.omnirio.poc.utility.CustomIdGenerator")
    @GeneratedValue(generator = "productid")  
	@Column(name = "productid")
	private String productID;
	private String productName;
	private Integer pCategoryID;
	private String pCategoryName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_categoryid")
	
	private Category category;

	

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getpCategoryName() {
		return pCategoryName;
	}

	public void setpCategoryName(String pCategoryName) {
		this.pCategoryName = pCategoryName;
	}


	public Integer getpCategoryID() {
		return pCategoryID;
	}

	public void setpCategoryID(Integer pCategoryID) {
		this.pCategoryID = pCategoryID;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}

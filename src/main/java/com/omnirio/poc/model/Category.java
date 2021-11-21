/**
 * 
 */
package com.omnirio.poc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author rkumar
 *
 */


    @Entity
    @Table(name = "category")
	public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "categoryid")
		private Integer attributeID;
		private String	attributeName;
		private String	attributeColor;
		private String	atributeSize;
		private String	attributeMaterial;
		private String  attributeBrand;
		private Integer attributeWeight;
		private Integer attributeVolume;
		
		@OneToOne(mappedBy = "category" )
		private Products products;
		
		
		public Integer getAttributeID() {
			return attributeID;
		}
		public void setAttributeID(Integer attributeID) {
			this.attributeID = attributeID;
		}
		public String getAttributeName() {
			return attributeName;
		}
		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}
		public String getAttributeColor() {
			return attributeColor;
		}
		public void setAttributeColor(String attributeColor) {
			this.attributeColor = attributeColor;
		}
		public String getAtributeSize() {
			return atributeSize;
		}
		public void setAtributeSize(String atributeSize) {
			this.atributeSize = atributeSize;
		}
		public String getAttributeMaterial() {
			return attributeMaterial;
		}
		public void setAttributeMaterial(String attributeMaterial) {
			this.attributeMaterial = attributeMaterial;
		}
		public String getAttributeBrand() {
			return attributeBrand;
		}
		public void setAttributeBrand(String attributeBrand) {
			this.attributeBrand = attributeBrand;
		}
		public Integer getAttributeWeight() {
			return attributeWeight;
		}
		public void setAttributeWeight(Integer attributeWeight) {
			this.attributeWeight = attributeWeight;
		}
		public Integer getAttributeVolume() {
			return attributeVolume;
		}
		public void setAttributeVolume(Integer attributeVolume) {
			this.attributeVolume = attributeVolume;
		}
	
		
		

}

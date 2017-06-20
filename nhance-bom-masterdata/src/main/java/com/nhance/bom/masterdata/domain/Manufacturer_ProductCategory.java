/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: Manufacturer_ProductCategory.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.bom.masterdata.domain;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * The Class Manufacturer_ProductCategory.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@RelationshipEntity(type = "HAS_PRODUCTCATEGORY")
public class Manufacturer_ProductCategory {
	
	/** The manufacturer. */
	private Manufacturer manufacturer;
	
	/** The product category. */
	private ProductCategory productCategory;

	/**
	 * Gets the manufacturer.
	 *
	 * @return the manufacturer
	 */
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	/**
	 * Sets the manufacturer.
	 *
	 * @param manufacturer the new manufacturer
	 */
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Gets the product category.
	 *
	 * @return the product category
	 */
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	/**
	 * Sets the product category.
	 *
	 * @param productCategory the new product category
	 */
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manufacturer_ProductCategory [manufacturer=");
		builder.append(manufacturer);
		builder.append(", productCategory=");
		builder.append(productCategory);
		builder.append("]");
		return builder.toString();
	}

}

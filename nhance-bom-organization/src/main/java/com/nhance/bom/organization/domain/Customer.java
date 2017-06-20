/* Copyright © inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with inspirion.
*
* Id: Brand.java
*
* Date Author Changes
* 2 Jun, 2017 Saroj Created
*/
package com.nhance.bom.organization.domain;

import java.util.Set;

import javax.validation.Valid;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.domain.annotation.TenantEnabled;
import com.nhance.bom.masterdata.domain.Manufacturer;
import com.nhance.bom.masterdata.domain.ProductCategory;

/**
 * The Class Brand.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
@TenantEnabled
public class Customer extends Organization {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 9108606711421216604L;

	/** The product categories. */
	@Valid
	@Relationship(type = "PRODUCT_CATEGORY")
	private Set<ProductCategory> productCategories;
	
	/** The manufacturers. */
	@Valid
	@Relationship(type = "MANUFACTURERS")
	private Set<Manufacturer> manufacturers;
	
	/**
	 * Gets the product categories.
	 *
	 * @return the product categories
	 */
	public Set<ProductCategory> getProductCategories() {
		return productCategories;
	}

	/**
	 * Sets the product categories.
	 *
	 * @param productCategories the new product categories
	 */
	public void setProductCategories(Set<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}

	/**
	 * Gets the manufacturers.
	 *
	 * @return the manufacturers
	 */
	public Set<Manufacturer> getManufacturers() {
		return manufacturers;
	}

	/**
	 * Sets the manufacturers.
	 *
	 * @param manufacturers the new manufacturers
	 */
	public void setManufacturers(Set<Manufacturer> manufacturers) {
		this.manufacturers = manufacturers;
	}

}

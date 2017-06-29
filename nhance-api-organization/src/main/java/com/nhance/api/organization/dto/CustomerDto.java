/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CustomerDto.java
*
* Date Author Changes
* 15 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.nhance.api.masterdata.dto.ManufacturerDto;
import com.nhance.api.masterdata.dto.ProductCategoryDto;

/**
 * The Class CustomerDto.
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include = As.PROPERTY, property = "@class")
public class CustomerDto extends OrganizationDto {
	
	/** The product category. */
	private List<ProductCategoryDto> productCategory;
	
	/** The manufacturer. */
	private List<ManufacturerDto> manufacturer;

	/**
	 * Gets the product category.
	 *
	 * @return the product category
	 */
	public List<ProductCategoryDto> getProductCategory() {
		return productCategory;
	}

	/**
	 * Sets the product category.
	 *
	 * @param productCategory the new product category
	 */
	public void setProductCategory(List<ProductCategoryDto> productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * Gets the manufacturer.
	 *
	 * @return the manufacturer
	 */
	public List<ManufacturerDto> getManufacturer() {
		return manufacturer;
	}

	/**
	 * Sets the manufacturer.
	 *
	 * @param manufacturer the new manufacturer
	 */
	public void setManufacturer(List<ManufacturerDto> manufacturer) {
		this.manufacturer = manufacturer;
	}

}

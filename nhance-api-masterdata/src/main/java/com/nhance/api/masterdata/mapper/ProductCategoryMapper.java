/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CountryMapper.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.api.masterdata.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.nhance.api.masterdata.dto.ProductCategoryDto;
import com.nhance.bom.masterdata.domain.ProductCategory;

/**
 * The Interface ProductCategoryMapper.
 */
@Mapper
public interface ProductCategoryMapper {
	
	/** The instance. */
	ProductCategoryMapper INSTANCE = Mappers.getMapper( ProductCategoryMapper.class );
	
	/**
	 * Map model to entity.
	 *
	 * @param dto the dto
	 * @return the product category
	 */
	public ProductCategory mapModelToEntity(ProductCategoryDto dto);
	
	/**
	 * Map entity to model.
	 *
	 * @param productCategory the product category
	 * @return the product category dto
	 */
	public ProductCategoryDto mapEntityToModel(ProductCategory productCategory);

}

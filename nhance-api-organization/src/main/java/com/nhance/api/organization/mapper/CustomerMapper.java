/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CustomerMapper.java
*
* Date Author Changes
* 23 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.nhance.api.organization.dto.CustomerDto;
import com.nhance.bom.organization.domain.Customer;

/**
 * The Interface CustomerMapper.
 */
@Mapper
public interface CustomerMapper {
	
	/** The instance. */
	CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );
	
	/**
	 * Map model to entity.
	 *
	 * @param dto the dto
	 * @return the customer
	 */
	@Mappings({
		@Mapping(source = "addressDto", target = "organizationAddress"),
		@Mapping(source = "manufacturer", target = "manufacturers"),
		@Mapping(source = "productCategory", target = "productCategories"),
	})
	public Customer mapModelToEntity(CustomerDto dto);
	
	/**
	 * Map entity to model.
	 *
	 * @param customer the customer
	 * @return the customer dto
	 */
	@InheritInverseConfiguration
	public CustomerDto mapEntityToModel(Customer customer);

}

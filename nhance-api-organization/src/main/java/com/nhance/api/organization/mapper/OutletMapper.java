/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OutletMapper.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.nhance.api.organization.dto.OutletDto;
import com.nhance.bom.organization.domain.Outlet;

/**
 * The Interface OutletMapper.
 */
@Mapper
public interface OutletMapper {
	
	/** The instance. */
	OutletMapper INSTANCE = Mappers.getMapper( OutletMapper.class );
	
	/**
	 * Map model to entity.
	 *
	 * @param dto the dto
	 * @return the outlet
	 */
	@Mapping(source = "addressDto", target = "organizationAddress")
	public Outlet mapModelToEntity(OutletDto dto);
	
	/**
	 * Map entity to model.
	 *
	 * @param customer the customer
	 * @return the outlet dto
	 */
	@InheritInverseConfiguration
	public OutletDto mapEntityToModel(Outlet customer);

}

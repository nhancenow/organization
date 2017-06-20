/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationMapper.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.nhance.api.organization.dto.OrganizationDto;
import com.nhance.bom.organization.domain.Organization;

/**
 * The Interface OrganizationMapper.
 */
@Mapper
public interface OrganizationMapper {
	
	/** The instance. */
	OrganizationMapper INSTANCE = Mappers.getMapper( OrganizationMapper.class );
	
	/**
	 * Map model to entity.
	 *
	 * @param dto the dto
	 * @return the organization
	 */
	@Mapping(source = "addressDto", target = "organizationAddress")
	public Organization mapModelToEntity(OrganizationDto dto);
	
	/**
	 * Map entity to model.
	 *
	 * @param organization the organization
	 * @return the organization dto
	 */
	@InheritInverseConfiguration
	public OrganizationDto mapEntityToModel(Organization organization);

}

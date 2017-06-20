/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: PartnerMapper.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.nhance.api.organization.dto.PartnerDto;
import com.nhance.bom.organization.domain.Partner;

/**
 * The Interface PartnerMapper.
 */
@Mapper
public interface PartnerMapper {
	
	/** The instance. */
	PartnerMapper INSTANCE = Mappers.getMapper( PartnerMapper.class );
	
	/**
	 * Map model to entity.
	 *
	 * @param dto the dto
	 * @return the partner
	 */
	@Mapping(source = "addressDto", target = "organizationAddress")
	public Partner mapModelToEntity(PartnerDto dto);
	
	/**
	 * Map entity to model.
	 *
	 * @param partner the partner
	 * @return the partner dto
	 */
	@InheritInverseConfiguration
	public PartnerDto mapEntityToModel(Partner partner);

}

/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: AddressMapper.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.api.address.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.nhance.api.address.dto.AddressDto;
import com.nhance.bom.address.domain.Address;

/**
 * The Interface AddressMapper.
 */
@Mapper(componentModel = "spring")
public interface AddressMapper {
	
	/** The instance. */
	AddressMapper INSTANCE = Mappers.getMapper( AddressMapper.class );
	
	/**
	 * Map model to entity.
	 *
	 * @param dto the dto
	 * @return the address
	 */
	public Address mapModelToEntity(AddressDto dto);
	
	/**
	 * Map entity to model.
	 *
	 * @param address the address
	 * @return the address dto
	 */
	public AddressDto mapEntityToModel(Address address);

}

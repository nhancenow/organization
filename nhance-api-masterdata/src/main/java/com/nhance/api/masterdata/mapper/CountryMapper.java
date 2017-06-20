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

import com.nhance.api.masterdata.dto.CountryDto;
import com.nhance.bom.masterdata.domain.Country;

/**
 * The Interface CountryMapper.
 */
@Mapper
public interface CountryMapper {
	
	/** The instance. */
	CountryMapper INSTANCE = Mappers.getMapper( CountryMapper.class );
	
	/**
	 * Map model to entity.
	 *
	 * @param dto the dto
	 * @return the country
	 */
	public Country mapModelToEntity(CountryDto dto);
	
	/**
	 * Map entity to model.
	 *
	 * @param country the country
	 * @return the country dto
	 */
	public CountryDto mapEntityToModel(Country country);

}

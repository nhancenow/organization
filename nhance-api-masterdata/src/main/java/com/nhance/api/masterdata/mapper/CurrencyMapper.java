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

import com.nhance.api.masterdata.dto.CurrencyDto;
import com.nhance.bom.masterdata.domain.Currency;

/**
 * The Interface CountryMapper.
 */
@Mapper
public interface CurrencyMapper {
	
	/** The instance. */
	CurrencyMapper INSTANCE = Mappers.getMapper( CurrencyMapper.class );
	
	/**
	 * Map model to entity.
	 *
	 * @param dto the dto
	 * @return the currency
	 */
	public Currency mapModelToEntity(CurrencyDto dto);
	
	/**
	 * Map entity to model.
	 *
	 * @param currency the currency
	 * @return the currency dto
	 */
	public CurrencyDto mapEntityToModel(Currency currency);

}

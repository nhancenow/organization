/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: PartnerDto.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.dto;

import java.util.Set;

import com.nhance.api.address.dto.AddressDto;

/**
 * The Class PartnerDto.
 */
public class PartnerDto extends OrganizationDto {
	
	/** The partner type. */
	private Integer partnerType;
	
	/** The partner address. */
	private Set<AddressDto> partnerAddress;

	/**
	 * Gets the partner type.
	 *
	 * @return the partner type
	 */
	public Integer getPartnerType() {
		return partnerType;
	}

	/**
	 * Sets the partner type.
	 *
	 * @param partnerType the new partner type
	 */
	public void setPartnerType(Integer partnerType) {
		this.partnerType = partnerType;
	}

	/**
	 * Gets the partner address.
	 *
	 * @return the partner address
	 */
	public Set<AddressDto> getPartnerAddress() {
		return partnerAddress;
	}

	/**
	 * Sets the partner address.
	 *
	 * @param partnerAddress the new partner address
	 */
	public void setPartnerAddress(Set<AddressDto> partnerAddress) {
		this.partnerAddress = partnerAddress;
	}

}

/* Copyright © inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with inspirion.
*
* Id: Partner.java
*
* Date Author Changes
* 2 Jun, 2017 Saroj Created
*/
package com.nhance.bom.organization.domain;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.domain.annotation.TenantEnabled;

/**
 * The Class Partner.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
@TenantEnabled
public class Partner extends Organization {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8810954241544203533L;

	/** The partner type. */
	private Integer partnerType;
	
	/** The organization address. */
	@Relationship(type = "HAS_ADDRESS", direction = Relationship.OUTGOING)
	private Set<Address> partnerAddress;

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

	public Set<Address> getPartnerAddress() {
		return partnerAddress;
	}

	public void setPartnerAddress(Set<Address> partnerAddress) {
		this.partnerAddress = partnerAddress;
	}
	
}

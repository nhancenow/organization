/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: Customer_Partner.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.bom.organization.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.domain.NBaseEntity;
import com.nhance.bom.domain.annotation.TenantEnabled;

/**
 * The Class Customer_Partner.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@RelationshipEntity(type = "HAS_PARTNER")
@TenantEnabled
public class Customer_Partner extends NBaseEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7316589139759659393L;

	/** The customer. */
	@EndNode
	private Customer customer;
	
	/** The partner. */
	@StartNode
	private Partner partner;

	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * Sets the customer.
	 *
	 * @param customer the new customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Gets the partner.
	 *
	 * @return the partner
	 */
	public Partner getPartner() {
		return partner;
	}

	/**
	 * Sets the partner.
	 *
	 * @param partner the new partner
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

}

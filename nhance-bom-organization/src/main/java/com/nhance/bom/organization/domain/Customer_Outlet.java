/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: Customer_Outlet.java
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
 * The Class Customer_Outlet.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@RelationshipEntity(type = "HAS_OUTLET")
@TenantEnabled
public class Customer_Outlet extends NBaseEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5593685129496342009L;

	/** The customer. */
	@EndNode
	private Customer customer;
	
	/** The outlet. */
	@StartNode
	private Outlet outlet;

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
	 * Gets the outlet.
	 *
	 * @return the outlet
	 */
	public Outlet getOutlet() {
		return outlet;
	}

	/**
	 * Sets the outlet.
	 *
	 * @param outlet the new outlet
	 */
	public void setOutlet(Outlet outlet) {
		this.outlet = outlet;
	}
	
}

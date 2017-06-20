/* Copyright © inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with inspirion.
*
* Id: Outlet.java
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
import com.nhance.bom.domain.annotation.TenantEnabled;
import com.nhance.bom.user.domain.User;

/**
 * The Class Outlet.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
@TenantEnabled
public class Outlet extends Organization {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3655720929455270279L;

	/** The outlet users. */
	@Relationship(type = "HAS_USER", direction = Relationship.OUTGOING)
	private Set<User> outletUsers;

	/**
	 * Gets the outlet users.
	 *
	 * @return the outlet users
	 */
	public Set<User> getOutletUsers() {
		return outletUsers;
	}

	/**
	 * Sets the outlet users.
	 *
	 * @param outletUsers the new outlet users
	 */
	public void setOutletUsers(Set<User> outletUsers) {
		this.outletUsers = outletUsers;
	}

}

/* Copyright © inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with inspirion.
*
* Id: User.java
*
* Date Author Changes
* 5 Jun, 2017 Saroj Created
*/
package com.nhance.bom.organization.domain;

import org.neo4j.ogm.annotation.RelationshipEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.domain.NBaseEntity;
import com.nhance.bom.domain.annotation.TenantEnabled;
import com.nhance.bom.user.domain.User;

/**
 * The Class User.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@RelationshipEntity(type = "HAS_USER")
@TenantEnabled
public class Organization_User extends NBaseEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7809222711121818250L;

	/** The organization. */
	private Organization organization;
	
	/** The user. */
	private User user;

	/**
	 * Gets the organization.
	 *
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * Sets the organization.
	 *
	 * @param organization the new organization
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
}

/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: User_Role.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.bom.user.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.domain.NBaseEntity;
import com.nhance.bom.domain.annotation.TenantEnabled;

/**
 * The Class User_Role.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@RelationshipEntity(type = "HAS_ROLE")
@TenantEnabled
public class User_Role extends NBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8798473734402682112L;

	/** The id. */
	@GraphId
	private Long id;
	
	/** The user. */
	private User user;
	
	/** The role. */
	private Role role;

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#getId()
	 */
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#setId(java.lang.Long)
	 */
	public void setId(Long id) {
		this.id = id;
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

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(Role role) {
		this.role = role;
	}

}

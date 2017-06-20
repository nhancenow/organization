/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: Role_Privilege.java
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

/**
 * The Class Role_Privilege.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@RelationshipEntity(type = "HAS_PRIVILEGE")
public class Role_Privilege extends NBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1743875534671523217L;

	/** The id. */
	@GraphId
	private Long id;
	
	/** The role. */
	private Role role;
	
	/** The privilege. */
	private Privilege privilege;

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

	/**
	 * Gets the privilege.
	 *
	 * @return the privilege
	 */
	public Privilege getPrivilege() {
		return privilege;
	}

	/**
	 * Sets the privilege.
	 *
	 * @param privilege the new privilege
	 */
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

}

/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: PrivilegeVisibility.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.bom.user.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.domain.NBaseEntity;

/**
 * The Class PrivilegeVisibility.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
public class PrivilegeVisibility extends NBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1367706079999939521L;

	/** The id. */
	@GraphId
	private Long id;
	
	/** The privilege. */
	private Privilege privilege;
	
	/** The privilege type. */
	private PrivilegeType privilegeType;

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

	/**
	 * Gets the privilege type.
	 *
	 * @return the privilege type
	 */
	public PrivilegeType getPrivilegeType() {
		return privilegeType;
	}

	/**
	 * Sets the privilege type.
	 *
	 * @param privilegeType the new privilege type
	 */
	public void setPrivilegeType(PrivilegeType privilegeType) {
		this.privilegeType = privilegeType;
	}

}

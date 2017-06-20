/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NFailureSync.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * The Class NFailureSync.
 */
@NodeEntity
public class NFailureSync extends NBaseEntity {

	/** The entity type. */
	private String entityType;
	
	/** The guid. */
	private String guid;
	
	/** The tenant id. */
	private String tenantId;
	
	/** The sync attempt time. */
	private String syncAttemptTime;

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#getEntityType()
	 */
	public String getEntityType() {
		return entityType;
	}

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#setEntityType(java.lang.String)
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#getGuid()
	 */
	public String getGuid() {
		return guid;
	}

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#setGuid(java.lang.String)
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the sync attempt time.
	 *
	 * @return the sync attempt time
	 */
	public String getSyncAttemptTime() {
		return syncAttemptTime;
	}

	/**
	 * Sets the sync attempt time.
	 *
	 * @param syncAttemptTime the new sync attempt time
	 */
	public void setSyncAttemptTime(String syncAttemptTime) {
		this.syncAttemptTime = syncAttemptTime;
	}

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#getTenantId()
	 */
	public String getTenantId() {
		return tenantId;
	}

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#setTenantId(java.lang.String)
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}

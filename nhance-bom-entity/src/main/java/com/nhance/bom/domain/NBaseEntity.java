/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NBaseEntity.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

import java.util.Date;

import org.neo4j.ogm.annotation.GraphId;

/**
 * The Class NBaseEntity.
 */
public abstract class NBaseEntity implements NhanceModel {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1950922883803010700L;

	/** The id. */
	@GraphId
	private Long id;
	
	/** The tenant id. */
	private String tenantId;
	
	/** The version. */
	private String version;
	
	/** The guid. */
	private String guid;
	
	/** The entity type. */
	private String entityType = this.getClass().getSimpleName();
	
	/** The created by user. */
	private String createdByUser;
	
	/** The last modified by user. */
	private String lastModifiedByUser;
	
	/** The created date. */
	private Date createdDate;
	
	/** The last modified date. */
	private Date lastModifiedDate;
	
	/** The entity state. */
	private NState entityState;
	
	/** The base ref. */
	private Long baseRef;
	
	/** The approved by. */
	private String approvedBy;
	
	/** The approved date. */
	private Date approvedDate;
	
	/** The sync. */
	private boolean sync;
	
	/** The sync timestamp. */
	private Date syncTimestamp;

	/**
	 * Gets the tenant id.
	 *
	 * @return the tenant id
	 */
	public String getTenantId() {
		return this.tenantId;
	}

	/**
	 * Sets the tenant id.
	 *
	 * @param tenantId the new tenant id
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the guid.
	 *
	 * @return the guid
	 */
	public String getGuid() {
		return this.guid;
	}

	/**
	 * Sets the guid.
	 *
	 * @param guid the new guid
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * Gets the entity type.
	 *
	 * @return the entity type
	 */
	public String getEntityType() {
		return this.entityType;
	}

	/**
	 * Sets the entity type.
	 *
	 * @param entityType the new entity type
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/**
	 * returns the key that will be used for caching this entity in redis.
	 * @return String redis key
	 */
	public String redisKey() {
		return this.getClass().getSimpleName();
	}

	/**
	 * Gets the created by user.
	 *
	 * @return the created by user
	 */
	public String getCreatedByUser() {
		return createdByUser;
	}

	/**
	 * Sets the created by user.
	 *
	 * @param createdByUser the new created by user
	 */
	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

	/**
	 * Gets the last modified by user.
	 *
	 * @return the last modified by user
	 */
	public String getLastModifiedByUser() {
		return lastModifiedByUser;
	}

	/**
	 * Sets the last modified by user.
	 *
	 * @param lastModifiedByUser the new last modified by user
	 */
	public void setLastModifiedByUser(String lastModifiedByUser) {
		this.lastModifiedByUser = lastModifiedByUser;
	}

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the last modified date.
	 *
	 * @return the last modified date
	 */
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * Sets the last modified date.
	 *
	 * @param lastModifiedDate the new last modified date
	 */
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	/**
	 * Gets the base ref.
	 *
	 * @return the base ref
	 */
	public Long getBaseRef() {
		return baseRef;
	}

	/**
	 * Gets the approved by.
	 *
	 * @return the approved by
	 */
	public String getApprovedBy() {
		return approvedBy;
	}

	/**
	 * Sets the base ref.
	 *
	 * @param baseRef the new base ref
	 */
	public void setBaseRef(Long baseRef) {
		this.baseRef = baseRef;
	}

	/**
	 * Sets the approved by.
	 *
	 * @param approvedBy the new approved by
	 */
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	/**
	 * Sets the approved date.
	 *
	 * @param approvedDate the new approved date
	 */
	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	/**
	 * Gets the approved date.
	 *
	 * @return the approved date
	 */
	public Date getApprovedDate() {
		return approvedDate;
	}

	/**
	 * Gets the entity state.
	 *
	 * @return the entity state
	 */
	public NState getEntityState() {
		return entityState;
	}

	/**
	 * Sets the entity state.
	 *
	 * @param entityState the new entity state
	 */
	public void setEntityState(NState entityState) {
		this.entityState = entityState;
	}

	/**
	 * Checks if is sync.
	 *
	 * @return true, if is sync
	 */
	public boolean isSync() {
		return sync;
	}

	/**
	 * Sets the sync.
	 *
	 * @param sync the new sync
	 */
	public void setSync(boolean sync) {
		this.sync = sync;
	}

	/**
	 * Gets the sync timestamp.
	 *
	 * @return the sync timestamp
	 */
	public Date getSyncTimestamp() {
		return syncTimestamp;
	}

	/**
	 * Sets the sync timestamp.
	 *
	 * @param syncTimestamp the new sync timestamp
	 */
	public void setSyncTimestamp(Date syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

	/**
	 * This is the default mechanism for providing entity identity to the OGM
	 *
	 * It is required because the OGM can currently accept objects with NO id
	 * value set. This is a restriction that must be changed
	 *
	 * @param o the object to compare, either or both may not yet be persisted.
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || id == null || getClass() != o.getClass()) {
			return false;
		}
		NBaseEntity entity = (NBaseEntity) o;

		if (!id.equals(entity.id)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (id == null) ? -1 : id.hashCode();
	}
}

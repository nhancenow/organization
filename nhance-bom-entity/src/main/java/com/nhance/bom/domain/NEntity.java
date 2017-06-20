/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NEntity.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

import org.neo4j.ogm.annotation.GraphId;

/**
 * The Class NEntity.
 */
public abstract class NEntity implements NhanceModel {

	/** The id. */
	@GraphId
	protected Long id;

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
	 * @param id the new entity id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This is the default mechanism for providing entity identity to the
	 * OGM
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
		NEntity entity = (NEntity) o;

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

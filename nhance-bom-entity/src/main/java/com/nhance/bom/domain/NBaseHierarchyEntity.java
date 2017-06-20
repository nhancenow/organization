/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NBaseHierarchyEntity.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

/**
 * The Class NBaseHierarchyEntity.
 */
public abstract class NBaseHierarchyEntity extends NBaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1130919906958445340L;

	/** The level. */
	private int level;
	
	/** The is parent entity. */
	private boolean isParentEntity;

	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Sets the level.
	 *
	 * @param level the new level
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * Checks if is parent entity.
	 *
	 * @return true, if is parent entity
	 */
	public boolean isParentEntity() {
		return isParentEntity;
	}

	/**
	 * Sets the parent entity.
	 *
	 * @param isParentEntity the new parent entity
	 */
	public void setParentEntity(boolean isParentEntity) {
		this.isParentEntity = isParentEntity;
	}

}

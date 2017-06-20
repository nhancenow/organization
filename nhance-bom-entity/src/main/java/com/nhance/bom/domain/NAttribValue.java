/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NAttribValue.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * The Class NAttribValue.
 */
@NodeEntity
public class NAttribValue extends NBaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7845203617537104692L;

	/** The value. */
	private String value;
	
	/** The name. */
	private String name;

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

}

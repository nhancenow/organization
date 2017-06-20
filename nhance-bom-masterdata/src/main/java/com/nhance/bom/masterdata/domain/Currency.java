/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: Currency.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.bom.masterdata.domain;

import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.domain.NBaseEntity;

/**
 * The Class Currency.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
public class Currency extends NBaseEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6015856413150958581L;

	/** The name. */
	private String name;
	
	/** The code. */
	private String code;
	
	/** The unicode. */
	private String unicode;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code the new code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Gets the unicode.
	 *
	 * @return the unicode
	 */
	public String getUnicode() {
		return unicode;
	}

	/**
	 * Sets the unicode.
	 *
	 * @param unicode the new unicode
	 */
	public void setUnicode(String unicode) {
		this.unicode = unicode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Currency [name=");
		builder.append(name);
		builder.append(", code=");
		builder.append(code);
		builder.append(", unicode=");
		builder.append(unicode);
		builder.append("]");
		return builder.toString();
	}

}

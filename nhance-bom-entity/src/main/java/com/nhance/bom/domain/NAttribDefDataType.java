/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NAttribDefDataType.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

/**
 * The Enum NAttribDefDataType.
 */
public enum NAttribDefDataType {

	/** The string. */
	STRING(1), /** The date. */
 DATE(2), /** The decimal. */
 DECIMAL(3), /** The number. */
 NUMBER(4);

	/** The type. */
	private Integer type;

	/**
	 * Instantiates a new n attrib def data type.
	 *
	 * @param type the type
	 */
	NAttribDefDataType(Integer type) {
		this.type = type;
	}

	/**
	 * Type.
	 *
	 * @return the integer
	 */
	public Integer type() {
		return this.type;
	}

	/**
	 * Enumtype.
	 *
	 * @param type the type
	 * @return the n attrib def data type
	 */
	public static NAttribDefDataType enumtype(Integer type) {
		switch (type) {
		case 1:
			return STRING;
		case 2:
			return DATE;
		case 3:
			return DECIMAL;
		case 4:
			return NUMBER;
		}
		return null;
	}

}

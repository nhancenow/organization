/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NSequenceEnum.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

/**
 * The Enum SequenceDefinition.
 */
public enum SequenceDefinition {

	/** The organization code. */
	ORGANIZATION_CODE("ORG", "organization_code", 6);

	/** The name. */
	private String name;

	/** The category code. */
	private String categoryCode;

	/** The min length. */
	private int minSeqLength;

	/**
	 * Instantiates a new sequence enum.
	 *
	 * @param categoryCode the category code
	 * @param name the name
	 * @param minSeqLength the min seq length
	 */
	SequenceDefinition(String categoryCode, String name, int minSeqLength) {
		this.categoryCode = categoryCode;
		this.name = name;
		this.minSeqLength = minSeqLength;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the category code.
	 *
	 * @return the category code
	 */
	public String getCategoryCode() {
		return categoryCode;
	}

	/**
	 * Gets the min seq length.
	 *
	 * @return the min seq length
	 */
	public int getMinSeqLength() {
		return minSeqLength;
	}
}

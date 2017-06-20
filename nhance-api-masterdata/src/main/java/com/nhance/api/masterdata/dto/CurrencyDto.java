/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CurrencyDto.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.api.masterdata.dto;

/**
 * The Class CurrencyDto.
 */
public class CurrencyDto {
	
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

}

/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationType.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.bom.organization.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum OrganizationType.
 */
public enum OrganizationType {

	/** The nhance. */
	NHANCE(1, "Nhance"),
	
	/** The brand. */
	BRAND(2, "Brand"),
	
	/** The retailer. */
	RETAILER(3, "Retailer"),
	
	/** The partner. */
	PARTNER(4, "Partner"),
	
	/** The outlet. */
	OUTLET(5, "Outlet"),
	
	/** The others. */
	OTHERS(6, "Others" );
	
	/** The code. */
	private Integer code;
	
	/** The text. */
	private String text;
	
	/** The organization type map. */
	private static Map<Integer, String> organizationTypeMap = new HashMap<Integer, String>();

	static {
		for ( OrganizationType organizationType : OrganizationType.values() ) {
			organizationTypeMap.put( organizationType.getCode(), organizationType.getText() );
		}
	}
	
	/**
	 * Instantiates a new organization type.
	 *
	 * @param code the code
	 * @param text the text
	 */
	private OrganizationType(Integer code, String text) {
		this.code = code;
		this.text = text;
	}
	
	/**
	 * Gets the organization type map.
	 *
	 * @return the organization type map
	 */
	public static Map<Integer, String> getOrganizationTypeMap() {
		return organizationTypeMap;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Gets the organization type map.
	 *
	 * @param code the code
	 * @return the organization type map
	 */
	public static String getOrganizationTypeMap( final Integer code ) {
		if ( organizationTypeMap.get( code ) != null )  {
			return organizationTypeMap.get( code );
		}
		return "";
	}
}

/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationStatus.java
*
* Date Author Changes
* 12 Jun, 2017 Saroj Created
*/
package com.nhance.bom.organization.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum OrganizationStatus.
 */
public enum OrganizationStatus {

	/** The onboarded. */
	ONBOARDED(1, "Onboarded"),
	
	/** The active. */
	ACTIVE(2, "Active"),
	
	/** The inactive. */
	INACTIVE(3, "Inactive" ),
	
	/** The delete. */
	DELETE(4, "Inactive" );
	
	/** The code. */
	private Integer code;
	
	/** The text. */
	private String text;
	
	/** The organization status map. */
	private static Map<Integer, String> organizationStatusMap = new HashMap<Integer, String>();

	static {
		for ( OrganizationStatus organizationStatus : OrganizationStatus.values() ) {
			organizationStatusMap.put( organizationStatus.getCode(), organizationStatus.getText() );
		}
	}
	
	/**
	 * Instantiates a new organization type.
	 *
	 * @param code the code
	 * @param text the text
	 */
	private OrganizationStatus(Integer code, String text) {
		this.code = code;
		this.text = text;
	}
	
	/**
	 * Gets the organization status map.
	 *
	 * @return the organization status map
	 */
	public static Map<Integer, String> getOrganizationStatusMap() {
		return organizationStatusMap;
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
	 * Gets the organization status map.
	 *
	 * @param code the code
	 * @return the organization status map
	 */
	public static String getOrganizationStatusMap( final Integer code ) {
		if ( organizationStatusMap.get( code ) != null )  {
			return organizationStatusMap.get( code );
		}
		return "";
	}
}

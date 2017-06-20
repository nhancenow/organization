/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: PartnerType.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.bom.organization.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * The Enum PartnerType.
 */
public enum PartnerType {
	
	/** The extended warranty. */
	EXTENDED_WARRANTY( 1, "Extended Warranty" ),
	
	/** The accessories. */
	ACCESSORIES(2, "Accessories" ),
	
	/** The insurance. */
	INSURANCE(3, "Insurance" ),
	
	/** The amc. */
	AMC(4, "AMC" ),
	
	/** The service. */
	SERVICE(5, "Service" ),
	
	/** The sales. */
	SALES(6, "Sales" ),
	
	/** The recycle. */
	RECYCLE(7, "Recycle" ),
	
	/** The others. */
	OTHERS(8, "Others" );
	
	/** The code. */
	private Integer code;
	
	/** The text. */
	private String text;
	
	/** The partner type map. */
	private static Map<Integer, String> partnerTypeMap = new HashMap<Integer, String>();

	static {
		for ( PartnerType partnerType : PartnerType.values() ) {
			partnerTypeMap.put( partnerType.getCode(), partnerType.getText() );
		}
	}
	
	/**
	 * Instantiates a new partner type enum.
	 *
	 * @param code the code
	 * @param text the text
	 */
	private PartnerType(Integer code, String text) {
		this.code = code;
		this.text = text;
	}
	
	/**
	 * Gets the partner type map.
	 *
	 * @return the partner type map
	 */
	public static Map<Integer, String> getPartnerTypeMap() {
		return partnerTypeMap;
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
	 * Gets the partner type.
	 *
	 * @param code the code
	 * @return the partner type
	 */
	public static String getPartnerType( final Integer code ) {
		if ( partnerTypeMap.get( code ) != null )  {
			return partnerTypeMap.get( code );
		}
		return "";
	}
	
}

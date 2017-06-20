/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: NAttribDefinition.java
*
* Date Author Changes
* 7 Jun, 2017 Saroj Created
*/
package com.nhance.bom.domain;

import javax.validation.constraints.NotNull;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * The Class NAttribDefinition.
 */
@NodeEntity
public class NAttribDefinition extends NBaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1642138584726093272L;

	/** The max length. */
	private Integer maxLength;
	
	/** The data type. */
	private Integer dataType;
	
	/** The min length. */
	private Integer minLength;
	
	/** The display name. */
	private String displayName;
	
	/** The required. */
	private boolean required;
	
	/** The mandatory. */
	private boolean mandatory;
	
	/** The attribute name. */
	@NotNull
	private String attributeName;
	
	/** The is user defined. */
	private boolean isUserDefined;

	/**
	 * Gets the max length.
	 *
	 * @return the max length
	 */
	public Integer getMaxLength() {
		return this.maxLength;
	}

	/**
	 * Sets the max length.
	 *
	 * @param maxLength the new max length
	 */
	public void setMaxLength(Integer maxLength) {
		this.maxLength = maxLength;
	}

	/**
	 * Gets the data type.
	 *
	 * @return the data type
	 */
	public Integer getDataType() {
		return this.dataType;
	}

	/**
	 * Sets the data type.
	 *
	 * @param dataType the new data type
	 */
	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	/**
	 * Sets the data type enum.
	 *
	 * @param dataType the new data type enum
	 */
	public void setDataTypeEnum(NAttribDefDataType dataType) {
		this.dataType = dataType.type();
	}

	/**
	 * Gets the data type enum.
	 *
	 * @return the data type enum
	 */
	public NAttribDefDataType getDataTypeEnum() {
		return NAttribDefDataType.enumtype(dataType);
	}

	/**
	 * Gets the min length.
	 *
	 * @return the min length
	 */
	public Integer getMinLength() {
		return this.minLength;
	}

	/**
	 * Sets the min length.
	 *
	 * @param minLength the new min length
	 */
	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	/**
	 * Gets the display name.
	 *
	 * @return the display name
	 */
	public String getDisplayName() {
		return this.displayName;
	}

	/**
	 * Sets the display name.
	 *
	 * @param displayName the new display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * Gets the required.
	 *
	 * @return the required
	 */
	public boolean getRequired() {
		return this.required;
	}

	/**
	 * Sets the required.
	 *
	 * @param required the new required
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}

	/**
	 * Gets the mandatory.
	 *
	 * @return the mandatory
	 */
	public boolean getMandatory() {
		return this.mandatory;
	}

	/**
	 * Sets the mandatory.
	 *
	 * @param mandatory the new mandatory
	 */
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	/**
	 * Gets the attribute name.
	 *
	 * @return the attribute name
	 */
	public String getAttributeName() {
		return this.attributeName;
	}

	/**
	 * Sets the attribute name.
	 *
	 * @param attributeName the new attribute name
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	/**
	 * Checks if is user defined.
	 *
	 * @return true, if is user defined
	 */
	public boolean isUserDefined() {
		return isUserDefined;
	}

	/**
	 * Sets the user defined.
	 *
	 * @param isUserDefined the new user defined
	 */
	public void setUserDefined(boolean isUserDefined) {
		this.isUserDefined = isUserDefined;
	}
}

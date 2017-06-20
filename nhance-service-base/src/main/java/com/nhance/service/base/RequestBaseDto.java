/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: RequestBaseDto.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.service.base;

import com.nhance.bom.domain.NhanceModel;

/**
 * The Class RequestBaseDto.
 */
public class RequestBaseDto implements NhanceModel {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6358078382872169982L;

	/** The tenant id. */
	private String tenantId;
	
	/** The transmited time. */
	private Long transmitedTime;
	
	/** The created time. */
	private Long createdTime;
	
	/** The transaction time. */
	private Long transactionTime;
	
	/** The locale. */
	private String locale;
	
	/** The version number. */
	private String versionNumber;
	
	/** The pagination required. */
	private boolean paginationRequired;
	
	/** The loggin user. */
	private String logginUser;
	
	/** The request type. */
	private Integer requestType;
	
	/** The request method. */
	private Integer requestMethod;

	/**
	 * Gets the tenant id.
	 *
	 * @return the tenant id
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * Sets the tenant id.
	 *
	 * @param tenantId the new tenant id
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Gets the transmited time.
	 *
	 * @return the transmited time
	 */
	public Long getTransmitedTime() {
		return transmitedTime;
	}

	/**
	 * Sets the transmited time.
	 *
	 * @param transmitedTime the new transmited time
	 */
	public void setTransmitedTime(Long transmitedTime) {
		this.transmitedTime = transmitedTime;
	}

	/**
	 * Gets the created time.
	 *
	 * @return the created time
	 */
	public Long getCreatedTime() {
		return createdTime;
	}

	/**
	 * Sets the created time.
	 *
	 * @param createdTime the new created time
	 */
	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * Gets the transaction time.
	 *
	 * @return the transaction time
	 */
	public Long getTransactionTime() {
		return transactionTime;
	}

	/**
	 * Sets the transaction time.
	 *
	 * @param transactionTime the new transaction time
	 */
	public void setTransactionTime(Long transactionTime) {
		this.transactionTime = transactionTime;
	}

	/**
	 * Gets the locale.
	 *
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Sets the locale.
	 *
	 * @param locale the new locale
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * Gets the version number.
	 *
	 * @return the version number
	 */
	public String getVersionNumber() {
		return versionNumber;
	}

	/**
	 * Sets the version number.
	 *
	 * @param versionNumber the new version number
	 */
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	/**
	 * Checks if is pagination required.
	 *
	 * @return true, if is pagination required
	 */
	public boolean isPaginationRequired() {
		return paginationRequired;
	}

	/**
	 * Sets the pagination required.
	 *
	 * @param paginationRequired the new pagination required
	 */
	public void setPaginationRequired(boolean paginationRequired) {
		this.paginationRequired = paginationRequired;
	}

	/**
	 * Gets the loggin user.
	 *
	 * @return the loggin user
	 */
	public String getLogginUser() {
		return logginUser;
	}

	/**
	 * Sets the loggin user.
	 *
	 * @param logginUser the new loggin user
	 */
	public void setLogginUser(String logginUser) {
		this.logginUser = logginUser;
	}

	/**
	 * Gets the request type.
	 *
	 * @return the request type
	 */
	public Integer getRequestType() {
		return requestType;
	}

	/**
	 * Sets the request type.
	 *
	 * @param requestType the new request type
	 */
	public void setRequestType(Integer requestType) {
		this.requestType = requestType;
	}

	/**
	 * Gets the request method.
	 *
	 * @return the request method
	 */
	public Integer getRequestMethod() {
		return requestMethod;
	}

	/**
	 * Sets the request method.
	 *
	 * @param requestMethod the new request method
	 */
	public void setRequestMethod(Integer requestMethod) {
		this.requestMethod = requestMethod;
	}
}

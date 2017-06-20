/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: ResponseBaseDto.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.service.base;

import com.nhance.bom.domain.NhanceModel;

/**
 * The Class ResponseBaseDto.
 */
public class ResponseBaseDto implements NhanceModel {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5093254073633593680L;

	/** The tenant id. */
	private String tenantId;
	
	/** The transaction time. */
	private Long transactionTime;
	
	/** The locale. */
	private String locale;
	
	/** The version number. */
	private String versionNumber;
	
	/** The total result size. */
	private Integer totalResultSize;
	
	/** The response status. */
	private Integer responseStatus;
	
	/** The response message. */
	private String responseMessage;

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
	 * Gets the total result size.
	 *
	 * @return the total result size
	 */
	public Integer getTotalResultSize() {
		return totalResultSize;
	}

	/**
	 * Sets the total result size.
	 *
	 * @param totalResultSize the new total result size
	 */
	public void setTotalResultSize(Integer totalResultSize) {
		this.totalResultSize = totalResultSize;
	}

	/**
	 * Gets the response status.
	 *
	 * @return the response status
	 */
	public Integer getResponseStatus() {
		return responseStatus;
	}

	/**
	 * Sets the response status.
	 *
	 * @param responseStatus the new response status
	 */
	public void setResponseStatus(Integer responseStatus) {
		this.responseStatus = responseStatus;
	}

	/**
	 * Gets the response message.
	 *
	 * @return the response message
	 */
	public String getResponseMessage() {
		return responseMessage;
	}

	/**
	 * Sets the response message.
	 *
	 * @param responseMessage the new response message
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}

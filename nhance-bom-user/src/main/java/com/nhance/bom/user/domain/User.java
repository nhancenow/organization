/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: User.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.bom.user.domain;

import java.util.Date;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.domain.NBaseEntity;
import com.nhance.bom.domain.annotation.TenantEnabled;

/**
 * The Class User.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
@TenantEnabled
public class User extends NBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4877577812513710544L;

	/** The id. */
	@GraphId
	private Long id;
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The dob. */
	private Date dob;
	
	/** The gender. */
	private String gender;
	
	/** The email. */
	private String email;
	
	/** The mobile. */
	private String mobile;
	
	/** The security code. */
	private String securityCode;
	
	/** The account enabled. */
	private String accountEnabled;
	
	/** The credential expired. */
	private String credentialExpired;
	
	/** The login attempts. */
	private Integer loginAttempts;
	
	/** The status. */
	private Integer status;
	
	/** The password expiry date. */
	private Date passwordExpiryDate;

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#getId()
	 */
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see com.nhance.bom.domain.NBaseEntity#setId(java.lang.Long)
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the mobile.
	 *
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the mobile.
	 *
	 * @param mobile the new mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * Gets the security code.
	 *
	 * @return the security code
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * Sets the security code.
	 *
	 * @param securityCode the new security code
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * Gets the account enabled.
	 *
	 * @return the account enabled
	 */
	public String getAccountEnabled() {
		return accountEnabled;
	}

	/**
	 * Sets the account enabled.
	 *
	 * @param accountEnabled the new account enabled
	 */
	public void setAccountEnabled(String accountEnabled) {
		this.accountEnabled = accountEnabled;
	}

	/**
	 * Gets the credential expired.
	 *
	 * @return the credential expired
	 */
	public String getCredentialExpired() {
		return credentialExpired;
	}

	/**
	 * Sets the credential expired.
	 *
	 * @param credentialExpired the new credential expired
	 */
	public void setCredentialExpired(String credentialExpired) {
		this.credentialExpired = credentialExpired;
	}

	/**
	 * Gets the login attempts.
	 *
	 * @return the login attempts
	 */
	public Integer getLoginAttempts() {
		return loginAttempts;
	}

	/**
	 * Sets the login attempts.
	 *
	 * @param loginAttempts the new login attempts
	 */
	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * Gets the password expiry date.
	 *
	 * @return the password expiry date
	 */
	public Date getPasswordExpiryDate() {
		return passwordExpiryDate;
	}

	/**
	 * Sets the password expiry date.
	 *
	 * @param passwordExpiryDate the new password expiry date
	 */
	public void setPasswordExpiryDate(Date passwordExpiryDate) {
		this.passwordExpiryDate = passwordExpiryDate;
	}

}

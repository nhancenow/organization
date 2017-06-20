/* Copyright © inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of EasOfTech. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with inspirion.
*
* Id: Organization.java
*
* Date Author Changes
* 2 Jun, 2017 Saroj Created
*/
package com.nhance.bom.organization.domain;

import java.util.Date;
import java.util.Set;

import javax.validation.Valid;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.domain.NBaseEntity;
import com.nhance.bom.domain.annotation.TenantEnabled;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.TimeZone;

/**
 * The Class Organization.
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@NodeEntity
@TenantEnabled
public class Organization extends NBaseEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -344376780298071115L;

	/** The organization code. */
	private String organizationCode;
	
	/** The organization name. */
	private String organizationName;
	
	/** The organization type. */
	private Integer organizationType;
	
	/** The organization email. */
	private String organizationEmail;
	
	/** The organization phone. */
	private String organizationPhone;
	
	/** The organization status. */
	private Integer organizationStatus;
	
	/** The organization onboard date. */
	private Date organizationOnboardDate;
	
	/** The organization onboarded by. */
	private String organizationOnboardedBy;
	
	/** The organization logo. */
	private String organizationLogo;
	
	/** The country. */
	@Valid
	@Relationship(type = "COUNTRY")
	private Country country;
	
	/** The currency. */
	@Valid
	@Relationship(type = "CURRENCY")
	private Currency currency;
	
	/** The time zones. */
	@Valid
	@Relationship(type = "TIMEZONES")
	private Set<TimeZone> timeZones;
	
	/** The users. */
	@Valid
	@Relationship(type = "USERS")
	private Set<Organization_User> users;
	
	/** The organization address. */
	@Relationship(type = "HAS_ADDRESS", direction = Relationship.OUTGOING)
	private Address organizationAddress;
	
	/** The linked organization. */
	@Relationship(type = "LINKED_ORGANIZATION")
	private Set<Organization> linkedOrganization;

	/**
	 * Gets the organization code.
	 *
	 * @return the organization code
	 */
	public String getOrganizationCode() {
		return organizationCode;
	}

	/**
	 * Sets the organization code.
	 *
	 * @param organizationCode the new organization code
	 */
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	/**
	 * Gets the organization name.
	 *
	 * @return the organization name
	 */
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * Sets the organization name.
	 *
	 * @param organizationName the new organization name
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	/**
	 * Gets the organization type.
	 *
	 * @return the organization type
	 */
	public Integer getOrganizationType() {
		return organizationType;
	}

	/**
	 * Sets the organization type.
	 *
	 * @param organizationType the new organization type
	 */
	public void setOrganizationType(Integer organizationType) {
		this.organizationType = organizationType;
	}

	/**
	 * Gets the organization email.
	 *
	 * @return the organization email
	 */
	public String getOrganizationEmail() {
		return organizationEmail;
	}

	/**
	 * Sets the organization email.
	 *
	 * @param organizationEmail the new organization email
	 */
	public void setOrganizationEmail(String organizationEmail) {
		this.organizationEmail = organizationEmail;
	}

	/**
	 * Gets the organization phone.
	 *
	 * @return the organization phone
	 */
	public String getOrganizationPhone() {
		return organizationPhone;
	}

	/**
	 * Sets the organization phone.
	 *
	 * @param organizationPhone the new organization phone
	 */
	public void setOrganizationPhone(String organizationPhone) {
		this.organizationPhone = organizationPhone;
	}

	/**
	 * Gets the organization status.
	 *
	 * @return the organization status
	 */
	public Integer getOrganizationStatus() {
		return organizationStatus;
	}

	/**
	 * Sets the organization status.
	 *
	 * @param organizationStatus the new organization status
	 */
	public void setOrganizationStatus(Integer organizationStatus) {
		this.organizationStatus = organizationStatus;
	}

	/**
	 * Gets the organization onboard date.
	 *
	 * @return the organization onboard date
	 */
	public Date getOrganizationOnboardDate() {
		return organizationOnboardDate;
	}

	/**
	 * Sets the organization onboard date.
	 *
	 * @param organizationOnboardDate the new organization onboard date
	 */
	public void setOrganizationOnboardDate(Date organizationOnboardDate) {
		this.organizationOnboardDate = organizationOnboardDate;
	}

	/**
	 * Gets the organization onboarded by.
	 *
	 * @return the organization onboarded by
	 */
	public String getOrganizationOnboardedBy() {
		return organizationOnboardedBy;
	}

	/**
	 * Sets the organization onboarded by.
	 *
	 * @param organizationOnboardedBy the new organization onboarded by
	 */
	public void setOrganizationOnboardedBy(String organizationOnboardedBy) {
		this.organizationOnboardedBy = organizationOnboardedBy;
	}

	/**
	 * Gets the organization logo.
	 *
	 * @return the organization logo
	 */
	public String getOrganizationLogo() {
		return organizationLogo;
	}

	/**
	 * Sets the organization logo.
	 *
	 * @param organizationLogo the new organization logo
	 */
	public void setOrganizationLogo(String organizationLogo) {
		this.organizationLogo = organizationLogo;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency.
	 *
	 * @param currency the new currency
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	/**
	 * Gets the time zones.
	 *
	 * @return the time zones
	 */
	public Set<TimeZone> getTimeZones() {
		return timeZones;
	}

	/**
	 * Sets the time zones.
	 *
	 * @param timeZones the new time zones
	 */
	public void setTimeZones(Set<TimeZone> timeZones) {
		this.timeZones = timeZones;
	}

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	public Set<Organization_User> getUsers() {
		return users;
	}

	/**
	 * Sets the users.
	 *
	 * @param users the new users
	 */
	public void setUsers(Set<Organization_User> users) {
		this.users = users;
	}

	/**
	 * Gets the organization address.
	 *
	 * @return the organization address
	 */
	public Address getOrganizationAddress() {
		return organizationAddress;
	}

	/**
	 * Sets the organization address.
	 *
	 * @param organizationAddress the new organization address
	 */
	public void setOrganizationAddress(Address organizationAddress) {
		this.organizationAddress = organizationAddress;
	}

	/**
	 * Gets the linked organization.
	 *
	 * @return the linked organization
	 */
	public Set<Organization> getLinkedOrganization() {
		return linkedOrganization;
	}

	/**
	 * Sets the linked organization.
	 *
	 * @param linkedOrganization the new linked organization
	 */
	public void setLinkedOrganization(Set<Organization> linkedOrganization) {
		this.linkedOrganization = linkedOrganization;
	}
	
}

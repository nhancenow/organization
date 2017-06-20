/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationDto.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.dto;

import java.util.Date;
import java.util.List;

import com.nhance.api.address.dto.AddressDto;
import com.nhance.api.masterdata.dto.CountryDto;
import com.nhance.api.masterdata.dto.CurrencyDto;
import com.nhance.api.masterdata.dto.TimeZoneDto;

/**
 * The Class OrganizationDto.
 */
public class OrganizationDto {
	
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
	private CountryDto country;
	
	/** The currency. */
	private CurrencyDto currency;
	
	/** The time zones. */
	private List<TimeZoneDto> timeZones;
	
	/** The address dto. */
	private AddressDto addressDto;
	
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
	public CountryDto getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(CountryDto country) {
		this.country = country;
	}

	/**
	 * Gets the currency.
	 *
	 * @return the currency
	 */
	public CurrencyDto getCurrency() {
		return currency;
	}

	/**
	 * Sets the currency.
	 *
	 * @param currency the new currency
	 */
	public void setCurrency(CurrencyDto currency) {
		this.currency = currency;
	}

	/**
	 * Gets the time zones.
	 *
	 * @return the time zones
	 */
	public List<TimeZoneDto> getTimeZones() {
		return timeZones;
	}

	/**
	 * Sets the time zones.
	 *
	 * @param timeZones the new time zones
	 */
	public void setTimeZones(List<TimeZoneDto> timeZones) {
		this.timeZones = timeZones;
	}

	/**
	 * Gets the address dto.
	 *
	 * @return the address dto
	 */
	public AddressDto getAddressDto() {
		return addressDto;
	}

	/**
	 * Sets the address dto.
	 *
	 * @param addressDto the new address dto
	 */
	public void setAddressDto(AddressDto addressDto) {
		this.addressDto = addressDto;
	}

}

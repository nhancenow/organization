/* Copyright � Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: AddressDto.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.api.address.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * The Class AddressDto.
 */
public class AddressDto {
	
	/** The name. */
	@NotEmpty
	private String name;
	
	/** The mobile number. */
	@NotEmpty
	private String mobileNumber;
	
	/** The line one. */
	@NotEmpty
	private String lineOne;
	
	/** The line two. */
	private String lineTwo;
	
	/** The address type. */
	@NotNull
	private Integer addressType;
	
	/** The country. */
	@NotEmpty
	private String country;
	
	/** The state. */
	@NotEmpty
	private String state;
	
	/** The district. */
	private String district;
	
	/** The city. */
	@NotEmpty
	private String city;
	
	/** The pin code. */
	@NotEmpty
	private String pinCode;
	
	/** The latitude. */
	private String latitude;
	
	/** The longitude. */
	private String longitude;

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
	 * Gets the mobile number.
	 *
	 * @return the mobile number
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * Sets the mobile number.
	 *
	 * @param mobileNumber the new mobile number
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * Gets the line one.
	 *
	 * @return the line one
	 */
	public String getLineOne() {
		return lineOne;
	}

	/**
	 * Sets the line one.
	 *
	 * @param lineOne the new line one
	 */
	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	/**
	 * Gets the line two.
	 *
	 * @return the line two
	 */
	public String getLineTwo() {
		return lineTwo;
	}

	/**
	 * Sets the line two.
	 *
	 * @param lineTwo the new line two
	 */
	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	/**
	 * Gets the address type.
	 *
	 * @return the address type
	 */
	public Integer getAddressType() {
		return addressType;
	}

	/**
	 * Sets the address type.
	 *
	 * @param addressType the new address type
	 */
	public void setAddressType(Integer addressType) {
		this.addressType = addressType;
	}

	/**
	 * Gets the country.
	 *
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Sets the country.
	 *
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the district.
	 *
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * Sets the district.
	 *
	 * @param district the new district
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the pin code.
	 *
	 * @return the pin code
	 */
	public String getPinCode() {
		return pinCode;
	}

	/**
	 * Sets the pin code.
	 *
	 * @param pinCode the new pin code
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the new latitude
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the new longitude
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "AddressDto [name=" + name + ", mobileNumber=" + mobileNumber + ", lineOne=" + lineOne + ", lineTwo="
				+ lineTwo + ", addressType=" + addressType + ", country=" + country + ", state=" + state + ", district="
				+ district + ", city=" + city + ", pinCode=" + pinCode + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
	}
	
}

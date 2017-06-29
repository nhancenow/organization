/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CustomerService.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.nhance.service.organization.service;

import java.util.List;

import com.nhance.api.organization.dto.CustomerDto;

/**
 * The Interface CustomerService.
 */
public interface CustomerService {
	
	/**
	 * Adds the customer.
	 *
	 * @param customerDto the customer dto
	 * @return the customer dto
	 */
	public CustomerDto addCustomer(CustomerDto customerDto);
	
	/**
	 * Load customer.
	 *
	 * @param customerDto the customer dto
	 * @return the customer dto
	 */
	public CustomerDto loadCustomer(CustomerDto customerDto);
	
	/**
	 * View customer.
	 *
	 * @param customerDto the customer dto
	 * @return the list
	 */
	public List<CustomerDto> viewCustomer(CustomerDto customerDto);

}

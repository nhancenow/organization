/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CustomerController.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.nhance.service.organization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhance.api.organization.dto.CustomerDto;
import com.nhance.service.base.controller.BaseController;
import com.nhance.service.organization.service.CustomerService;

/**
 * The Class CustomerController.
 */
@RestController("/")
public class CustomerController extends BaseController {
	
	/** The customer service. */
	@Autowired
	private CustomerService customerService;
	
	/**
	 * Adds the organization.
	 *
	 * @param customerDto the customer dto
	 * @return the customer dto
	 */
	@RequestMapping(value = "/customer/addCustomer")
	public @ResponseBody CustomerDto addCustomer(@RequestBody CustomerDto customerDto) {
		customerDto = customerService.addCustomer(customerDto);
		return customerDto;
	}
	
	/**
	 * Load customer.
	 *
	 * @param customerDto the customer dto
	 * @return the customer dto
	 */
	@RequestMapping(value = "/customer/loadCustomer")
	public @ResponseBody CustomerDto loadCustomer(@RequestBody CustomerDto customerDto) {
		customerDto = customerService.loadCustomer(customerDto);
		return customerDto;
	}
	
	/**
	 * View customer.
	 *
	 * @param customerDto the customer dto
	 * @return the list
	 */
	@RequestMapping(value = "/customer/viewCustomer")
	public @ResponseBody List<CustomerDto> viewCustomer(@RequestBody CustomerDto customerDto) {
		List<CustomerDto> customerList = customerService.viewCustomer(customerDto);
		return customerList;
	}

}

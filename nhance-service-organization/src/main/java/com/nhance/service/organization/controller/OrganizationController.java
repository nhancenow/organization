/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationController.java
*
* Date Author Changes
* 14 Jun, 2017 Saroj Created
*/
package com.nhance.service.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhance.api.organization.dto.OrganizationDto;
import com.nhance.service.base.controller.BaseController;
import com.nhance.service.organization.service.OrganizationService;

@RestController
@RequestMapping("/organization")
public class OrganizationController extends BaseController {
	
	/** The organization service. */
	@Autowired
	private OrganizationService organizationService;
	
	/**
	 * Adds the organization.
	 *
	 * @param organizationDto the organization dto
	 * @return the organization dto
	 */
	@RequestMapping(path = "/addOrganization", method = RequestMethod.POST)
	public @ResponseBody OrganizationDto addOrganization(@RequestBody OrganizationDto organizationDto) {
		organizationDto = organizationService.addOrganization(organizationDto);
		return organizationDto;
	}

}

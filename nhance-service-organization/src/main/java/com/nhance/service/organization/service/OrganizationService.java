/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationService.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.service.organization.service;

import java.util.List;
import java.util.Map;

import com.nhance.api.organization.dto.OrganizationDto;
import com.nhance.bom.organization.domain.Organization;

/**
 * The Interface OrganizationService.
 */
public interface OrganizationService {
	
	/**
	 * Adds the organization.
	 *
	 * @param organizationDto the organization dto
	 * @return the organization dto
	 */
	public OrganizationDto addOrganization(OrganizationDto organizationDto);
	
	/**
	 * Update organization.
	 *
	 * @param organization the organization
	 * @return the organization
	 */
	public Organization updateOrganization(Organization organization);
	
	/**
	 * Load organization.
	 *
	 * @param organization the organization
	 * @return the organization
	 */
	public Organization loadOrganization(Organization organization);
	
	/**
	 * List organization.
	 *
	 * @param organization the organization
	 * @return the map
	 */
	public Map<String, String> listOrganization(Organization organization);
	
	/**
	 * View organization.
	 *
	 * @param organization the organization
	 * @return the list
	 */
	public List<Organization> viewOrganization(Organization organization);
	
	/**
	 * Delete organization.
	 *
	 * @param organization the organization
	 * @return the list
	 */
	public List<Organization> deleteOrganization(Organization organization);

}

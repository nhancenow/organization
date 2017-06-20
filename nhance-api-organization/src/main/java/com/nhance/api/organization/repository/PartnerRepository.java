/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: PartnerRepository.java
*
* Date Author Changes
* 15 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.nhance.bom.organization.domain.Partner;

/**
 * The Interface PartnerRepository.
 */
public interface PartnerRepository extends GraphRepository<Partner> {
	
	/**
	 * Find by organization code.
	 *
	 * @param organizationCode the organization code
	 * @return the partner
	 */
	Partner findByOrganizationCode(String organizationCode);

}

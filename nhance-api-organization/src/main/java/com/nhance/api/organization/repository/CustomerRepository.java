/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CustomerRepository.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.nhance.bom.organization.domain.Customer;

/**
 * The Interface CustomerRepository.
 */
@Repository("customerRepository")
public interface CustomerRepository extends GraphRepository<Customer> {
	
	/**
	 * Find by organization code.
	 *
	 * @param organizationCode the organization code
	 * @return the customer
	 */
	Customer findByOrganizationCode(String organizationCode);
	
	/**
	 * Find by organization name.
	 *
	 * @param organizationName the organization name
	 * @return the customer
	 */
	Customer findByOrganizationName(String organizationName);
	
}

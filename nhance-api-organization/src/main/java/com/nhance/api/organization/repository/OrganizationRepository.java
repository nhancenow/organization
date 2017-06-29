/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationRepository.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.repository;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nhance.bom.domain.SequenceStore;
import com.nhance.bom.organization.domain.Organization;

/**
 * The Interface OrganizationRepository.
 */
@Repository("organizationRepository")
public interface OrganizationRepository extends GraphRepository<Organization> {
	
	/**
	 * Find by sequence code.
	 *
	 * @param categoryCode the category code
	 * @return the sequence store
	 */
	@Query("MATCH (n:SequenceStore{sequenceCode:{sequenceCode}}) RETURN n")
	SequenceStore findBySequenceCode(@Param("sequenceCode") String sequenceCode);
	
	/**
	 * Find by organization code.
	 *
	 * @param organizationCode the organization code
	 * @return the organization
	 */
	Organization findByOrganizationCode(String organizationCode);
	
	/**
	 * Find by organization name.
	 *
	 * @param organizationName the organization name
	 * @return the organization
	 */
	Organization findByOrganizationName(String organizationName);
	
	/**
	 * Graph.
	 *
	 * @param limit the limit
	 * @return the collection
	 */
	/*@Query("MATCH (o:Organization) RETURN o LIMIT {limit}")
	Collection<Organization> graph(@Param("limit") int limit);*/

	
	
}

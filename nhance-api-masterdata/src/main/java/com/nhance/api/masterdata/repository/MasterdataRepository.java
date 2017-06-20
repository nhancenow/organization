/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: MasterdataRepository.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhance.api.masterdata.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nhance.bom.domain.NBaseEntity;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.Manufacturer;
import com.nhance.bom.masterdata.domain.ProductCategory;
import com.nhance.bom.masterdata.domain.TimeZone;

/**
 * The Interface MasterdataRepository.
 */
@Repository("masterdataRepository")
public interface MasterdataRepository extends GraphRepository<NBaseEntity> {
	
	/**
	 * Find by country code.
	 *
	 * @param countryCode the country code
	 * @return the country
	 */
	@Query("MATCH (n:Country{code:{countryCode}}) RETURN n")
	public Country findByCountryCode(@Param("countryCode") String countryCode);
	
	/**
	 * Delete country.
	 */
	@Query("MATCH (n:Country) DETACH DELETE n")
	public void deleteCountry();
	
	/**
	 * Find by currency code.
	 *
	 * @param currencyCode the currency code
	 * @return the currency
	 */
	@Query("MATCH (n:Currency{code:{currencyCode}}) RETURN n")
	public Currency findByCurrencyCode(@Param("currencyCode") String currencyCode);
	
	/**
	 * Delete currency.
	 */
	@Query("MATCH (n:Currency) DETACH DELETE n")
	public void deleteCurrency();
	
	/**
	 * Find by timezone code.
	 *
	 * @param timezoneCode the timezone code
	 * @return the sets the
	 */
	@Query("MATCH (n:TimeZone) where n.code in {0} return n")
	public Set<TimeZone> findByTimezoneCode(List<String> timezoneCode);
	
	/**
	 * Delete time zone.
	 */
	@Query("MATCH (n:TimeZone) DETACH DELETE n")
	public void deleteTimeZone();
	
	/**
	 * Find by product category.
	 *
	 * @param productCategoryName the product category name
	 * @return the sets the
	 */
	@Query("MATCH (n:ProductCategory) where n.name in {0} return n")
	public Set<ProductCategory> findByProductCategory(List<String> productCategoryName);
	
	/**
	 * Delete product category.
	 */
	@Query("MATCH (n:ProductCategory) DETACH DELETE n")
	public void deleteProductCategory();
	
	/**
	 * Find by manufacturer.
	 *
	 * @param manufacturerNames the manufacturer names
	 * @return the sets the
	 */
	@Query("MATCH (n:Manufacturer) where n.name in {0} return n")
	public Set<Manufacturer> findByManufacturer(List<String> manufacturerNames);
	
	/**
	 * Delete manufacturer.
	 */
	@Query("MATCH (n:Manufacturer) DETACH DELETE n")
	public void deleteManufacturer();
	
	/**
	 * Delete sequence store.
	 */
	@Query("MATCH (n:SequenceStore) DETACH DELETE n")
	public void deleteSequenceStore();

}

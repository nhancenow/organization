/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: MasterdataRepositoryTest.java
*
* Date Author Changes
* 16 Jun, 2017 Saroj Created
*/
package com.nhance.api.masterdata.test.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhance.api.masterdata.repository.MasterdataRepository;
import com.nhance.api.masterdata.test.setup.MasterdataTestSetup;
import com.nhance.bom.domain.SequenceDefinition;
import com.nhance.bom.domain.SequenceStore;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.Manufacturer;
import com.nhance.bom.masterdata.domain.ProductCategory;
import com.nhance.bom.masterdata.domain.TimeZone;

/**
 * The Class MasterdataRepositoryTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MasterdataTestSetup.class })
@ActiveProfiles(profiles = "test")
public class MasterdataRepositoryTest {
	
	/** The masterdata repository. */
	@Autowired
	MasterdataRepository masterdataRepository;
	
	/**
	 * Clean up.
	 */
	@After
	public void cleanUp() {
		masterdataRepository.deleteCountry();
		masterdataRepository.deleteCurrency();
		masterdataRepository.deleteTimeZone();
		masterdataRepository.deleteProductCategory();
		masterdataRepository.deleteManufacturer();
		masterdataRepository.deleteSequenceStore();
	}
	
	/**
	 * Adds the masterdata.
	 */
	@Test
	public void addMasterdata() {

		SequenceStore sequenceStore = new SequenceStore();
		sequenceStore.setSequenceCode(SequenceDefinition.ORGANIZATION_CODE.getCategoryCode());
		sequenceStore.setSequenceNumber(1L);
		masterdataRepository.save(sequenceStore);
		
		Country country = new Country();
		country.setCode("IND");
		country.setName("India");
		masterdataRepository.save(country);
		
		Currency currency = new Currency();
		currency.setCode("INR");
		currency.setName("Indian Rupee");
		masterdataRepository.save(currency);
		
		TimeZone timeZone = new TimeZone();
		timeZone.setCode("IST");
		timeZone.setName("Indian Standard Time");
		masterdataRepository.save(timeZone);
		
		timeZone = new TimeZone();
		timeZone.setCode("UTC");
		timeZone.setName("UTC");
		masterdataRepository.save(timeZone);
		
		ProductCategory productCategory = new ProductCategory();
		productCategory.setCode("PC101");
		productCategory.setName("Electronics");
		masterdataRepository.save(productCategory);
		
		productCategory = new ProductCategory();
		productCategory.setCode("PC102");
		productCategory.setName("Automobiles");
		masterdataRepository.save(productCategory);
		
		productCategory = new ProductCategory();
		productCategory.setCode("PC103");
		productCategory.setName("Home Appliances");
		masterdataRepository.save(productCategory);
		
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setCode("MAN101");
		manufacturer.setName("Samsung");
		masterdataRepository.save(manufacturer);
		
		manufacturer = new Manufacturer();
		manufacturer.setCode("MAN102");
		manufacturer.setName("LG");
		masterdataRepository.save(manufacturer);
		
		manufacturer = new Manufacturer();
		manufacturer.setCode("MAN103");
		manufacturer.setName("Lenovo");
		masterdataRepository.save(manufacturer);
		
		manufacturer = new Manufacturer();
		manufacturer.setCode("MAN104");
		manufacturer.setName("Leapure");
		masterdataRepository.save(manufacturer);
		
		manufacturer = new Manufacturer();
		manufacturer.setCode("MAN105");
		manufacturer.setName("Propure");
		masterdataRepository.save(manufacturer);
	
	}

}

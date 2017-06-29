/* Copyright � Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationRepositoryTest.java
*
* Date Author Changes
* 12 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.test.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhance.api.masterdata.repository.MasterdataRepository;
import com.nhance.api.organization.repository.OrganizationRepository;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.address.domain.AddressType;
import com.nhance.bom.domain.SequenceDefinition;
import com.nhance.bom.domain.SequenceStore;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.Manufacturer;
import com.nhance.bom.masterdata.domain.ProductCategory;
import com.nhance.bom.masterdata.domain.TimeZone;
import com.nhance.bom.organization.domain.Customer;
import com.nhance.bom.organization.domain.Organization;
import com.nhance.bom.organization.domain.OrganizationStatus;
import com.nhnace.api.organization.test.setup.OrganizationTestSetup;

/**
 * The Class OrganizationRepositoryTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { OrganizationTestSetup.class })
@ActiveProfiles(profiles = "test")
public class OrganizationRepositoryTest {
	
	/** The organization repository. */
	@Autowired
	private OrganizationRepository organizationRepository;
	
	/** The masterdata repository. */
	@Autowired
	private MasterdataRepository masterdataRepository;
	
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		buildMasterData();
	}

	/**
	 * Delete data.
	 */
	@After
	public void deleteData() {
		organizationRepository.deleteAll();
		organizationRepository.deleteAll();
		masterdataRepository.deleteCountry();
		masterdataRepository.deleteCurrency();
		masterdataRepository.deleteTimeZone();
		masterdataRepository.deleteProductCategory();
		masterdataRepository.deleteManufacturer();
		masterdataRepository.deleteSequenceStore();
	}
	
	/**
	 * Adds the organization.
	 */
	@Test
	public void addOrganization() {
		Customer customer = new Customer();
		customer.setOrganizationCode(generateOrganizationCode());
		customer.setOrganizationName("Organization5");
		customer.setOrganizationType(1);
		customer.setOrganizationEmail("saroj3030@gmail.com");
		customer.setOrganizationPhone("9620521051");
		customer.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		customer.setOrganizationOnboardDate(new Date());
		customer.setOrganizationOnboardedBy("Saroj");
		customer.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
		customer.setOrganizationOnboardedBy("saroj");
		
		Country country = masterdataRepository.findByCountryCode("IND");
		if(null != country)
			customer.setCountry(country);
		
		Currency currency = masterdataRepository.findByCurrencyCode("INR");
		if(null != currency)
			customer.setCurrency(currency);
		
		Set<TimeZone> timeZones = masterdataRepository
				.findByTimezoneCode(new ArrayList<String>(Arrays.asList("IST", "UTC")));
		if(CollectionUtils.isNotEmpty(timeZones))
			customer.setTimeZones(timeZones);
		
		Address address = new Address();
		address.setAddressType(AddressType.OFFICE.getCode());
		address.setName("Saroj");
		address.setMobileNumber("9620521051");
		address.setLineOne("lineOne");
		address.setLineTwo("lineTwo");
		address.setCountry("country");
		address.setState("state");
		address.setDistrict("district");
		address.setCity("city");
		address.setPinCode("pinCode");
		address.setStatus(OrganizationStatus.ACTIVE.getCode());
		masterdataRepository.save(address);
		customer.setOrganizationAddress(address);
		
		Set<ProductCategory> productCategories = masterdataRepository
				.findByProductCategory(new ArrayList<String>(Arrays.asList("Electronics", "Automobiles")));
		if(CollectionUtils.isNotEmpty(productCategories))
			customer.setProductCategories(productCategories);
		
		Set<Manufacturer> manufacturers = masterdataRepository
				.findByManufacturer(new ArrayList<String>(Arrays.asList("Samsung", "LG")));
		if(CollectionUtils.isNotEmpty(manufacturers))
			customer.setManufacturers(manufacturers);
		organizationRepository.save(customer);
		
	}
	
	/**
	 * View organization.
	 */
	/*public void viewOrganization() {
		Collection<Organization> graph = organizationRepository.graph(5);
		Assert.assertNotNull(graph);
	}*/
	
	/**
	 * Load organization.
	 */
	@Test
	public void loadOrganization() {
		Organization organization = organizationRepository.findByOrganizationCode("10000001");
		Assert.assertNotNull(organization);
	}

	/**
	 * Generate organization code.
	 *
	 * @return the string
	 */
	private String generateOrganizationCode() {
		SequenceStore organizationSequence = organizationRepository
				.findBySequenceCode(SequenceDefinition.ORGANIZATION_CODE.getCategoryCode());
		String organizationCode = StringUtils.leftPad(Long.toString(organizationSequence.getSequenceNumber()),
				SequenceDefinition.ORGANIZATION_CODE.getMinSeqLength(), '0');
		organizationSequence.setSequenceNumber(organizationSequence.getSequenceNumber() + 1);
		organizationSequence.setLastModifiedDate(new Date());
		masterdataRepository.save(organizationSequence);
		return new StringBuilder().append(10).append(organizationCode).toString();
	}
	
	/**
	 * Builds the master data.
	 */
	private void buildMasterData() {
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

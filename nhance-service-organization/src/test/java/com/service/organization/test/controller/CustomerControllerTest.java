/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CustomerControllerTest.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.service.organization.test.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.nhance.api.address.dto.AddressDto;
import com.nhance.api.address.repository.AddressRepository;
import com.nhance.api.masterdata.dto.CountryDto;
import com.nhance.api.masterdata.dto.CurrencyDto;
import com.nhance.api.masterdata.dto.ManufacturerDto;
import com.nhance.api.masterdata.dto.ProductCategoryDto;
import com.nhance.api.masterdata.dto.TimeZoneDto;
import com.nhance.api.masterdata.repository.MasterdataRepository;
import com.nhance.api.organization.dto.CustomerDto;
import com.nhance.api.organization.repository.CustomerRepository;
import com.nhance.bom.address.domain.AddressType;
import com.nhance.bom.domain.SequenceDefinition;
import com.nhance.bom.domain.SequenceStore;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.Manufacturer;
import com.nhance.bom.masterdata.domain.ProductCategory;
import com.nhance.bom.masterdata.domain.TimeZone;
import com.nhance.bom.organization.domain.Customer;
import com.nhance.bom.organization.domain.OrganizationStatus;
import com.nhance.bom.organization.domain.OrganizationType;
import com.nhance.service.organization.InitOrganization;

/**
 * The Class CustomerControllerTest.
 */
@ContextConfiguration(classes = InitOrganization.class, initializers = ConfigFileApplicationContextInitializer.class)
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@ActiveProfiles(profiles = "test")
public class CustomerControllerTest {
	
	/** The serice base ip. */
	@Value("${service.ip}")
    private String sericeBaseIp;
	
	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;
	
	/** The rest template. */
	@Autowired
	private TestRestTemplate restTemplate;
	
	/** The masterdata repository. */
	@Autowired
	private MasterdataRepository masterdataRepository;
	
	/** The customer repository. */
	@Autowired
	private CustomerRepository customerRepository;
	
	/** The address repository. */
	@Autowired
	private AddressRepository addressRepository;
	
	/**
	 * Adds the customer.
	 */
	@Test
	public void addCustomer() {
		CustomerDto customerDto = createCustomerDto();
		restTemplate.postForEntity(sericeBaseIp + "customer/addCustomer", customerDto, CustomerDto.class);
	}
	
	/**
	 * Load customer.
	 */
	@Test
	public void loadCustomer() {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setOrganizationCode("10000001");
		customerDto = restTemplate.postForEntity(sericeBaseIp + "customer/loadCustomer", customerDto, CustomerDto.class).getBody();
		Assert.assertNotNull(customerDto);
		Assert.assertEquals("10000001", customerDto.getOrganizationCode());
	}
	
	/**
	 * View customer.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void viewCustomer() {
		CustomerDto customerDto = createCustomerDto();
		List<CustomerDto> customerDtos = restTemplate
				.postForEntity(sericeBaseIp + "customer/viewCustomer", customerDto, List.class).getBody();
		Assert.assertNotNull(customerDtos);
		Assert.assertTrue(customerDtos.size() >= 1);
	}
	
	/**
	 * Creates the customer dto.
	 *
	 * @return the customer dto
	 */
	private CustomerDto createCustomerDto() {
		CustomerDto customerDto = new CustomerDto();
		customerDto.setOrganizationName("Organization1");
		customerDto.setOrganizationType(OrganizationType.BRAND.getCode());
		customerDto.setOrganizationEmail("saroj3030@gmail.com");
		customerDto.setOrganizationPhone("9620521051");
		customerDto.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		customerDto.setOrganizationOnboardDate(new Date());
		customerDto.setOrganizationOnboardedBy("Saroj");
		customerDto.setOrganizationLogo("www.nhancenow.com");
		customerDto.setOrganizationOnboardedBy("saroj");
		
		CountryDto country = new CountryDto();
		country.setCode("IND");
		customerDto.setCountry(country);
		
		CurrencyDto currency = new CurrencyDto();
		currency.setCode("INR");
		customerDto.setCurrency(currency);
		
		List<TimeZoneDto> timeZones = new ArrayList<TimeZoneDto>();
		TimeZoneDto timeZone = new TimeZoneDto();
		timeZone.setCode("IST");
		timeZones.add(timeZone);
		
		timeZone = new TimeZoneDto();
		timeZone.setCode("UTC");
		timeZones.add(timeZone);
		customerDto.setTimeZones(timeZones);
		
		AddressDto addressDto = new AddressDto();
		addressDto.setAddressType(AddressType.OFFICE.getCode());
		addressDto.setName("Saroj");
		addressDto.setMobileNumber("9620521051");
		addressDto.setLineOne("lineOne");
		addressDto.setLineTwo("lineTwo");
		addressDto.setCountry("country");
		addressDto.setState("state");
		addressDto.setDistrict("district");
		addressDto.setCity("city");
		addressDto.setPinCode("pinCode");
		customerDto.setAddressDto(addressDto);
		
		List<ProductCategoryDto> productCategorys = new ArrayList<ProductCategoryDto>();
		ProductCategoryDto categoryDto = new ProductCategoryDto();
		categoryDto.setName("Electronics");
		productCategorys.add(categoryDto);
		categoryDto = new ProductCategoryDto();
		categoryDto.setName("Automobiles");
		productCategorys.add(categoryDto);
		customerDto.setProductCategory(productCategorys);
		
		List<ManufacturerDto> manufacturers = new ArrayList<ManufacturerDto>();
		ManufacturerDto manufacturerDto = new ManufacturerDto();
		manufacturerDto.setName("Samsung");
		manufacturers.add(manufacturerDto);
		manufacturerDto = new ManufacturerDto();
		manufacturerDto.setName("LG");
		manufacturers.add(manufacturerDto);
		customerDto.setManufacturer(manufacturers);
		return customerDto;
	}

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		SequenceStore sequenceStore = new SequenceStore();
		sequenceStore.setSequenceCode(SequenceDefinition.ORGANIZATION_CODE.getCategoryCode());
		sequenceStore.setSequenceNumber(2L);
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
		
		Customer customer = new Customer();
		customer.setOrganizationCode("10000001");
		customer.setOrganizationName("Customer");
		customer.setOrganizationType(OrganizationType.BRAND.getCode());
		customer.setOrganizationEmail("saroj3030@gmail.com");
		customer.setOrganizationPhone("9620521051");
		customer.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		customer.setOrganizationOnboardDate(new Date());
		customer.setOrganizationOnboardedBy("Saroj");
		customer.setOrganizationLogo("www.nhancenow.com");
		customer.setOrganizationOnboardedBy("saroj");
		
		customerRepository.save(customer);
	}
	
	/**
	 * Clean up.
	 */
	@After
	public void cleanUp() {
		customerRepository.deleteAll();
		masterdataRepository.deleteCountry();
		masterdataRepository.deleteCurrency();
		masterdataRepository.deleteTimeZone();
		masterdataRepository.deleteProductCategory();
		masterdataRepository.deleteManufacturer();
		masterdataRepository.deleteSequenceStore();
		addressRepository.deleteAll();
	}

}

/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CustomerMapperTest.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.nhance.api.organization.test.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhance.api.address.dto.AddressDto;
import com.nhance.api.masterdata.dto.CountryDto;
import com.nhance.api.masterdata.dto.CurrencyDto;
import com.nhance.api.masterdata.dto.ManufacturerDto;
import com.nhance.api.masterdata.dto.ProductCategoryDto;
import com.nhance.api.masterdata.dto.TimeZoneDto;
import com.nhance.api.organization.dto.CustomerDto;
import com.nhance.api.organization.mapper.CustomerMapper;
import com.nhance.bom.address.domain.Address;
import com.nhance.bom.address.domain.AddressType;
import com.nhance.bom.masterdata.domain.Country;
import com.nhance.bom.masterdata.domain.Currency;
import com.nhance.bom.masterdata.domain.Manufacturer;
import com.nhance.bom.masterdata.domain.ProductCategory;
import com.nhance.bom.masterdata.domain.TimeZone;
import com.nhance.bom.organization.domain.Customer;
import com.nhance.bom.organization.domain.OrganizationStatus;
import com.nhance.bom.organization.domain.OrganizationType;
import com.nhnace.api.organization.test.setup.OrganizationTestSetup;

/**
 * The Class CustomerMapperTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { OrganizationTestSetup.class })
@ActiveProfiles(profiles = "test")
public class CustomerMapperTest {
	
	/**
	 * Map model to entity.
	 */
	@Test
	public void mapModelToEntity() {
		CustomerDto customerDto = createCustomerDto();
		Customer  customer = CustomerMapper.INSTANCE.mapModelToEntity(customerDto);
		Assert.assertEquals(customerDto.getOrganizationName(), customer.getOrganizationName());
		Assert.assertEquals(customerDto.getOrganizationType(), customer.getOrganizationType());
		Assert.assertEquals(customerDto.getOrganizationEmail(), customer.getOrganizationEmail());
		Assert.assertEquals(customerDto.getOrganizationPhone(), customer.getOrganizationPhone());
		Assert.assertEquals(customerDto.getOrganizationStatus(), customer.getOrganizationStatus());
		Assert.assertEquals(customerDto.getOrganizationOnboardDate(), customer.getOrganizationOnboardDate());
		Assert.assertEquals(customerDto.getOrganizationOnboardedBy(), customer.getOrganizationOnboardedBy());
		Assert.assertEquals(customerDto.getOrganizationLogo(), customer.getOrganizationLogo());
		Assert.assertEquals(customerDto.getCountry().getCode(), customer.getCountry().getCode());
		Assert.assertEquals(customerDto.getCurrency().getCode(), customer.getCurrency().getCode());
		
		Assert.assertEquals(customerDto.getAddressDto().getCity(), customer.getOrganizationAddress().getCity());
		Assert.assertEquals(customerDto.getAddressDto().getCountry(), customer.getOrganizationAddress().getCountry());
		Assert.assertEquals(customerDto.getAddressDto().getDistrict(), customer.getOrganizationAddress().getDistrict());
		Assert.assertEquals(customerDto.getAddressDto().getLatitude(), customer.getOrganizationAddress().getLatitude());
		Assert.assertEquals(customerDto.getAddressDto().getLineOne(), customer.getOrganizationAddress().getLineOne());
		Assert.assertEquals(customerDto.getAddressDto().getLineTwo(), customer.getOrganizationAddress().getLineTwo());
		Assert.assertEquals(customerDto.getAddressDto().getLongitude(), customer.getOrganizationAddress().getLongitude());
		Assert.assertEquals(customerDto.getAddressDto().getMobileNumber(), customer.getOrganizationAddress().getMobileNumber());
		Assert.assertEquals(customerDto.getAddressDto().getName(), customer.getOrganizationAddress().getName());
		Assert.assertEquals(customerDto.getAddressDto().getPinCode(), customer.getOrganizationAddress().getPinCode());
		Assert.assertEquals(customerDto.getAddressDto().getState(), customer.getOrganizationAddress().getState());
		Assert.assertEquals(customerDto.getAddressDto().getAddressType(), customer.getOrganizationAddress().getAddressType());
	}
	
	/**
	 * Map entity to model.
	 */
	@Test
	public void mapEntityToModel() {
		Customer customer = createCustomer();
		CustomerDto customerDto = CustomerMapper.INSTANCE.mapEntityToModel(customer);
		Assert.assertEquals(customer.getOrganizationName(), customerDto.getOrganizationName());
		Assert.assertEquals(customer.getOrganizationType(), customerDto.getOrganizationType());
		Assert.assertEquals(customer.getOrganizationEmail(), customerDto.getOrganizationEmail());
		Assert.assertEquals(customer.getOrganizationPhone(), customerDto.getOrganizationPhone());
		Assert.assertEquals(customer.getOrganizationStatus(), customerDto.getOrganizationStatus());
		Assert.assertEquals(customer.getOrganizationOnboardDate(), customerDto.getOrganizationOnboardDate());
		Assert.assertEquals(customer.getOrganizationOnboardedBy(), customerDto.getOrganizationOnboardedBy());
		Assert.assertEquals(customer.getOrganizationLogo(), customerDto.getOrganizationLogo());
		Assert.assertEquals(customer.getCountry().getCode(), customerDto.getCountry().getCode());
		Assert.assertEquals(customer.getCurrency().getCode(), customerDto.getCurrency().getCode());
		
		Assert.assertEquals(customer.getOrganizationAddress().getCity(), customerDto.getAddressDto().getCity());
		Assert.assertEquals(customer.getOrganizationAddress().getCountry(), customerDto.getAddressDto().getCountry());
		Assert.assertEquals(customer.getOrganizationAddress().getDistrict(), customerDto.getAddressDto().getDistrict());
		Assert.assertEquals(customer.getOrganizationAddress().getLatitude(), customerDto.getAddressDto().getLatitude());
		Assert.assertEquals(customer.getOrganizationAddress().getLineOne(), customerDto.getAddressDto().getLineOne());
		Assert.assertEquals(customer.getOrganizationAddress().getLineTwo(), customerDto.getAddressDto().getLineTwo());
		Assert.assertEquals(customer.getOrganizationAddress().getLongitude(), customerDto.getAddressDto().getLongitude());
		Assert.assertEquals(customer.getOrganizationAddress().getMobileNumber(), customerDto.getAddressDto().getMobileNumber());
		Assert.assertEquals(customer.getOrganizationAddress().getName(), customerDto.getAddressDto().getName());
		Assert.assertEquals(customer.getOrganizationAddress().getPinCode(), customerDto.getAddressDto().getPinCode());
		Assert.assertEquals(customer.getOrganizationAddress().getState(), customerDto.getAddressDto().getState());
		Assert.assertEquals(customer.getOrganizationAddress().getAddressType(), customerDto.getAddressDto().getAddressType());
	}

	/**
	 * Creates the customer.
	 *
	 * @return the customer
	 */
	private Customer createCustomer() {
		Customer customer = new Customer();
		customer.setOrganizationName("Organization1");
		customer.setOrganizationType(OrganizationType.BRAND.getCode());
		customer.setOrganizationEmail("saroj3030@gmail.com");
		customer.setOrganizationPhone("9620521051");
		customer.setOrganizationStatus(OrganizationStatus.ONBOARDED.getCode());
		customer.setOrganizationOnboardDate(new Date());
		customer.setOrganizationOnboardedBy("Saroj");
		customer.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
		customer.setOrganizationOnboardedBy("saroj");
		
		Country country = new Country();
		country.setCode("IND");
		customer.setCountry(country);
		
		Currency currency = new Currency();
		currency.setCode("INR");
		customer.setCurrency(currency);
		
		Set<TimeZone> timeZones = new HashSet<TimeZone>();
		TimeZone timeZone = new TimeZone();
		timeZone.setCode("IST");
		timeZones.add(timeZone);
		
		timeZone = new TimeZone();
		timeZone.setCode("UTC");
		timeZones.add(timeZone);
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
		customer.setOrganizationAddress(address);
		
		Set<ProductCategory> productCategorys = new HashSet<ProductCategory>();
		ProductCategory category = new ProductCategory();
		category.setName("Electronics");
		productCategorys.add(category);
		category = new ProductCategory();
		category.setName("Automobiles");
		productCategorys.add(category);
		customer.setProductCategories(productCategorys);
		
		Set<Manufacturer> manufacturers = new HashSet<Manufacturer>();
		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setName("Samsung");
		manufacturers.add(manufacturer);
		manufacturer = new Manufacturer();
		manufacturer.setName("LG");
		manufacturers.add(manufacturer);
		customer.setManufacturers(manufacturers);
		return customer;
		
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
		customerDto.setOrganizationLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/2000px-Samsung_Logo.svg.png");
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

}

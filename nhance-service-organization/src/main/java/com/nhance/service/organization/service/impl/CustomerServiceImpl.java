/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: CustomerServiceImpl.java
*
* Date Author Changes
* 20 Jun, 2017 Saroj Created
*/
package com.nhance.service.organization.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nhance.api.masterdata.repository.MasterdataRepository;
import com.nhance.api.organization.dto.CustomerDto;
import com.nhance.api.organization.mapper.CustomerMapper;
import com.nhance.api.organization.repository.CustomerRepository;
import com.nhance.api.organization.repository.OrganizationRepository;
import com.nhance.bom.domain.SequenceDefinition;
import com.nhance.bom.domain.SequenceStore;
import com.nhance.bom.organization.domain.Customer;
import com.nhance.service.organization.service.CustomerService;

/**
 * The Class CustomerServiceImpl.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	/** The organization repository. */
	@Autowired
	private OrganizationRepository organizationRepository;
	
	/** The customer repository. */
	@Autowired
	private CustomerRepository customerRepository;
	
	/** The masterdata repository. */
	@Autowired
	private MasterdataRepository masterdataRepository;
	
	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.CustomerService#addCustomer(com.nhance.api.organization.dto.CustomerDto)
	 */
	@Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
		Customer customer = CustomerMapper.INSTANCE.mapModelToEntity(customerDto);
		customer.setOrganizationCode(generateOrganizationCode());
		customerRepository.save(customer);
		customerDto.setOrganizationCode(customer.getOrganizationCode());
		return customerDto;
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

	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.CustomerService#loadCustomer(com.nhance.api.organization.dto.CustomerDto)
	 */
	@Override
	public CustomerDto loadCustomer(CustomerDto customerDto) {
		Customer customer = customerRepository.findByOrganizationCode(customerDto.getOrganizationCode());
		if(null != customer) {
			customerDto = CustomerMapper.INSTANCE.mapEntityToModel(customer);
		}
		return customerDto;
	}

	/* (non-Javadoc)
	 * @see com.nhance.service.organization.service.CustomerService#viewCustomer(com.nhance.api.organization.dto.CustomerDto)
	 */
	@Override
	public List<CustomerDto> viewCustomer(CustomerDto customerDto) {
		List<CustomerDto> customerList = null;
		CustomerDto dto = null;
		Pageable pageable = new PageRequest(0, 10);
		Page<Customer> customerPage = customerRepository.findAll(pageable);
		if(null != customerPage && CollectionUtils.isNotEmpty(customerPage.getContent())) {
			customerList = new ArrayList<CustomerDto>();
			for (Customer customer : customerPage.getContent()) {
				dto = CustomerMapper.INSTANCE.mapEntityToModel(customer);
				customerList.add(dto);
			}
		}
		return customerList;
	}
	
}

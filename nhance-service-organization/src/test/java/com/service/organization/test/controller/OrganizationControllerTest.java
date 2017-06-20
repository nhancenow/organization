package com.service.organization.test.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.nhance.InitOrganization;
import com.nhance.api.organization.dto.OrganizationDto;

@ContextConfiguration(classes = InitOrganization.class)
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class OrganizationControllerTest {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void addOrganization() {
		OrganizationDto organizationDto = new OrganizationDto();
		restTemplate.postForEntity("http://localhost:8588/organization/addOrganization", organizationDto,
				OrganizationDto.class);
	}

}

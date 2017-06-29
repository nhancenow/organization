/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: InitOrganization.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.service.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * The Class InitOrganization.
 */
@SpringBootApplication
@EnableConfigurationProperties
@EnableAutoConfiguration
public class InitOrganization {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(InitOrganization.class, args);
	}
	

}

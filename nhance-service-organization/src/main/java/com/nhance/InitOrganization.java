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
package com.nhance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The Class InitOrganization.
 */
@SpringBootApplication
@EntityScan("com.nhance")
@EnableJpaRepositories(basePackages = "com.nhance")
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

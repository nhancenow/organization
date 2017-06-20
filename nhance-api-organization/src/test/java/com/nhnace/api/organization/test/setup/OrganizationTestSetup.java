/* Copyright � Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: OrganizationTestSetup.java
*
* Date Author Changes
* 13 Jun, 2017 Saroj Created
*/
package com.nhnace.api.organization.test.setup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nhance.common.neo4j.Neo4jConfigurationNhance;

/**
 * The Class OrganizationTestSetup.
 */
@EnableTransactionManagement
@ComponentScan(basePackages ="com.nhance")
@Configuration
@EnableNeo4jRepositories(basePackages = "com.nhance")
@Profile("test")
public class OrganizationTestSetup extends Neo4jConfigurationNhance {
	
	/**
	 * The Class Config.
	 */
	@Configuration
	@PropertySource("classpath:organization-test.properties")
	static class Config {
		
		/**
		 * Property sources placeholder configurer.
		 *
		 * @return the property sources placeholder configurer
		 */
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			return new PropertySourcesPlaceholderConfigurer();
		}
	}
}
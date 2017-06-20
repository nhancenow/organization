package com.nhance.api.address.test.setup;

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
@ComponentScan(basePackages = "com.nhance" )
@Configuration
@EnableNeo4jRepositories(basePackages = "com.nhance")
@Profile("test")
public class AddressTestSetup extends Neo4jConfigurationNhance {
	
	/**
	 * The Class Config.
	 */
	@Configuration
	@PropertySource("classpath:address-test.properties")
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

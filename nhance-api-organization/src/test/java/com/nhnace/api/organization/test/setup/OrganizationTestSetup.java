/* Copyright © Inspirion 2017. All rights reserved.
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

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The Class OrganizationTestSetup.
 */
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.nhance.bom", "com.nhance.api" })
@Configuration
@EnableNeo4jRepositories(basePackages = { "com.nhance.bom", "com.nhance.api" })
@ActiveProfiles(profiles = "test")
@PropertySource("classpath:organization-test.properties")
public class OrganizationTestSetup {

	/** The server database uri. */
	@Value("${neo4j.db.uri}")
	private String serverDatabaseUri;

	/** The username. */
	@Value("${neo4j.db.username}")
	private String username;

	/** The password. */
	@Value("${neo4j.db.password}")
	private String password;

	/**
	 * Session factory.
	 *
	 * @return the session factory
	 */
	@Bean
	public SessionFactory sessionFactory() {
		return new SessionFactory(configuration(), "com.nhance.bom");
	}

	/**
	 * Configuration.
	 *
	 * @return the org.neo 4 j.ogm.config. configuration
	 */
	@Bean
	public org.neo4j.ogm.config.Configuration configuration() {
		org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration();
		configuration.driverConfiguration().setCredentials(username, password).setURI(serverDatabaseUri);
		return configuration;
	}

	/**
	 * Transaction manager.
	 *
	 * @return the neo 4 j transaction manager
	 * @throws Exception the exception
	 */
	@Bean
	public Neo4jTransactionManager transactionManager() throws Exception {
		return new Neo4jTransactionManager(sessionFactory());
	}
	
}

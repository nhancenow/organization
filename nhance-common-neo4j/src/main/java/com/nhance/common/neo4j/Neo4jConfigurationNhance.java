/* Copyright © Inspirion 2017. All rights reserved.
*
* This software is the confidential and proprietary information
* of Inspirion. You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms and
* conditions entered into with Inspirion.
*
* Id: Neo4jConfigurationNhance.java
*
* Date Author Changes
* 8 Jun, 2017 Saroj Created
*/
package com.nhance.common.neo4j;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The Class Neo4jConfigurationNhance.
 */
@EnableNeo4jRepositories(basePackages = { "com.nhance.api", "com.nhance.service" })
@Configuration
@EnableTransactionManagement
public class Neo4jConfigurationNhance extends Neo4jConfiguration {

	/** The server database uri. */
	@Value("${neo4j.server.database.uri}")
    private String serverDatabaseUri;

    /** The username. */
    @Value("${neo4j.username}")
    private String username;

    /** The password. */
    @Value("${neo4j.password}")
    private String password;

    /* (non-Javadoc)
     * @see org.springframework.data.neo4j.config.Neo4jConfiguration#getSessionFactory()
     */
    @Bean
    @Override
    public SessionFactory getSessionFactory() {
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
	
}

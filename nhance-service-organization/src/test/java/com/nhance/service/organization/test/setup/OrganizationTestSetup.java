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
package com.nhance.service.organization.test.setup;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class OrganizationTestSetup.
 */
@EnableTransactionManagement
@Configuration
@ComponentScan(basePackages = { "com.nhance.bom", "com.nhance.api", "com.nhance.service" })
@EnableNeo4jRepositories(basePackages = { "com.nhance.api", "com.nhance.bom" })
public class OrganizationTestSetup extends WebMvcConfigurationSupport {

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
	 * @throws Exception
	 *             the exception
	 */
	@Bean
	public Neo4jTransactionManager transactionManager() throws Exception {
		return new Neo4jTransactionManager(sessionFactory());
	}

	/*@Bean
	public ObjectMapper jacksonObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		return objectMapper;
	}

	@Bean
	public MappingJackson2HttpMessageConverter customJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		jsonConverter.setObjectMapper(objectMapper);
		return jsonConverter;
	}*/
	
	@Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(mappingJackson2HttpMessageConverter());
    }
     
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false));
        return converter;
    }
}

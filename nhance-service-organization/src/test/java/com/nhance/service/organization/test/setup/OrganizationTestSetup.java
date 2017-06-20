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

import java.util.HashMap;
import java.util.Map;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The Class OrganizationTestSetup.
 */
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.nhance" })
@Configuration
@EnableNeo4jRepositories(basePackages = "com.nhance")
@EnableJpaRepositories(basePackages = "com.nhance.api")
public class OrganizationTestSetup extends Neo4jConfiguration {
	
	@PropertySource("classpath:organization-test.properties")
	static class Config {
		
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			return new PropertySourcesPlaceholderConfigurer();
		}
	}

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
        return new SessionFactory(getConfiguration(), "com.nhance");
    }

    /**
     * Configuration.
     *
     * @return the org.neo 4 j.ogm.config. configuration
     */
    @Bean
	public org.neo4j.ogm.config.Configuration getConfiguration() {
		org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration();
		configuration.driverConfiguration().setCredentials(username, password).setURI(serverDatabaseUri);
		return configuration;
	}
    
    @Bean
    public Session getSession() throws Exception {
      return super.getSession();
    }
	
    @Autowired
    @Bean(name = "neo4jTransactionManager")
    public Neo4jTransactionManager neo4jTransactionManager(Session sessionFactory) {
      return new Neo4jTransactionManager(sessionFactory);
    }
    
    @Autowired
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(Neo4jTransactionManager neo4jTransactionManager, JpaTransactionManager mysqlTransactionManager) {
      return new ChainedTransactionManager(
        neo4jTransactionManager
      );
    }
    
    public LocalContainerEntityManagerFactoryBean mongoEntityManager() throws Throwable {

    	Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("javax.persistence.transactionType", "resource_local");
        properties.put("hibernate.ogm.datastore.provider","neo4j");
        properties.put("hibernate.ogm.datastore.host","localhost");
        properties.put("hibernate.ogm.datastore.port","7474");
//        properties.put("hibernate.ogm.datastore.database", "your database");
        properties.put("hibernate.ogm.datastore.create_database", "false");

        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
        entityManager.setPackagesToScan("com.nhance");
        entityManager.setPersistenceUnitName("n4jPU");
        entityManager.setJpaPropertyMap(properties);
//        entityManager.setPersistenceProviderClass(HibernateOgmPersistence.class);
        return entityManager;
    }

}

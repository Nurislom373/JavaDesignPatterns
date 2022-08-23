package org.khasanof;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@EnableJpaRepositories
@SpringBootApplication
@Slf4j
public class Config {

    /**
     * Creation of H2 db.
     *
     * @return A new Instance of DataSource
     */
    @Bean
    public DataSource dataSource() {
        var basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("org.h2.Driver");
        basicDataSource.setUrl("jdbc:h2:~/databases/person");
        basicDataSource.setUsername("sa");
        basicDataSource.setPassword("sa");
        return basicDataSource;
    }

    /**
     * Factory to create a especific instance of Entity Manager.
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        var entityManager = new LocalContainerEntityManagerFactoryBean();
        entityManager.setDataSource(dataSource());
        entityManager.setPackagesToScan("com.iluwatar");
        entityManager.setPersistenceProvider(new HibernatePersistenceProvider());
        entityManager.setJpaProperties(jpaProperties());
        return entityManager;
    }

    /**
     * Properties for Jpa.
     */
    private static Properties jpaProperties() {
        var properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        return properties;
    }

    /**
     * Get transaction manager.
     */
    @Bean
    public JpaTransactionManager transactionManager() {
        var transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }
}

package com.coppel.enviocorreomasivo;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "correoMicroEntityManagerFactory", transactionManagerRef = "correoMicroTransactionManager",
basePackages = {"com.coppel.enviocorreomasivo.repositories"})
public class CorreoMicroConfig {
   @Autowired 
   private Environment env;
   @Bean(name = "correoMicroDataSource")
	public DataSource correoMicroDatasource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(env.getProperty("correomicro.datasource.url"));
		dataSource.setUsername(env.getProperty("correomicro.datasource.username"));
		dataSource.setPassword(env.getProperty("correomicro.datasource.password"));
		dataSource.setDriverClassName(env.getProperty("correomicro.datasource.driver-class-name"));
		
		return dataSource;
	}
    @Bean(name = "correoMicroEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(correoMicroDatasource());
		em.setPackagesToScan("com.coppel.enviocorreomasivo.entities");
		
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		
		Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", env.getProperty("correomicro.jpa.hibernate.ddl-auto"));
		properties.put("hibernate.show-sql", env.getProperty("correomicro.jpa.show-sql"));
		properties.put("hibernate.dialect", env.getProperty("correomicro.jpa.database-platform"));
		
		em.setJpaPropertyMap(properties);
		
		return em;
		
	}

    @Bean(name = "correoMicroTransactionManager")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		
		return transactionManager;
	}

}

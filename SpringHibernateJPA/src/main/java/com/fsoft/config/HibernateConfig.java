package com.fsoft.config;

import java.util.Set;

import javax.persistence.EntityManagerFactory;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.reflections.Reflections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class HibernateConfig {

	@Bean(name = "entityManagerFactory")
	public EntityManagerFactory entityManagerFactory() {

		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
				.loadProperties("hibernate.properties").build();

		MetadataSources source = new MetadataSources(standardRegistry);

		Reflections reflections = new Reflections();
		Set<Class<?>> classes = reflections.getTypesAnnotatedWith(javax.persistence.Entity.class);
		for (Class<?> clazz : classes)
			source.addAnnotatedClass(clazz);

		Metadata metadata = source.getMetadataBuilder().build();
		return metadata.getSessionFactoryBuilder().build();
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {

		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory);
		return txManager;
	}
}
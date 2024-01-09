package com.kshrd.kshrd_websiteapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {
    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setUrl("jdbc:postgresql://35.220.202.124/kshrd_website_8th");
        driverManagerDataSource.setUsername("kshrd_website");
        driverManagerDataSource.setPassword("kshrdwebsite!@#");

        return driverManagerDataSource;
    }
}
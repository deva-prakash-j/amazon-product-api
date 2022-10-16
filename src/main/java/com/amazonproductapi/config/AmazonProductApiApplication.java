package com.amazonproductapi.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.amazonproductapi"})
public class AmazonProductApiApplication extends SpringBootServletInitializer {

  private static final Logger LOGGER = LogManager.getLogger(AmazonProductApiApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AmazonProductApiApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(AmazonProductApiApplication.class);
  }

  @Bean
  public Logger logger() {
    return this.LOGGER;
  }

}

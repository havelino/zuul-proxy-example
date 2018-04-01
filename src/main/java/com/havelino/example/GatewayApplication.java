/**
 * 
 */
package com.havelino.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.havelino.example.zuul.filters.SimpleFilter;

/**
 * @author hha0009
 *
 */
@EnableZuulProxy
@SpringBootApplication
@ComponentScan(basePackages = { "com.havelino.example" })
public class GatewayApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GatewayApplication.class);
	}
	
	public static void main(String[] args) {
	    SpringApplication.run(GatewayApplication.class, args);
	  }

	  @Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }

}

package base.order.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.mapping.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;


@Configuration
public class ApplicationConfig {

	@Autowired
	Environment environment;
	
	/***************MessageSource객체등록*******************/
	@Bean("messageSource")
	public MessageSource messageSource() {
		ResourceBundleMessageSource resourceBundleMessageSource =
				new ResourceBundleMessageSource();
		
		resourceBundleMessageSource.setBasename("");
		return resourceBundleMessageSource;		
	}
	
	@Bean
	public BasicDataSource apacheDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		/*
		 * dataSource.setUrl(environment.getProperty(""));
		 * dataSource.setUsername(environment.getProperty(""));
		 * dataSource.setPassword(environment.getProperty(""));
		 */
		
		return dataSource;
	}
	
	
}

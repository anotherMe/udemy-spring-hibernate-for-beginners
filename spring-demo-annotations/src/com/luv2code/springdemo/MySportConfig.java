package com.luv2code.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * WITH COMPONENT SCAN
 * 
 * In this configuration we just specify the @ComponentScan annotation
 * to have Spring scanning our package com.luv2code.springdemo to
 * retrieve all the beans.
 * 
 * @author Marco
 *
 */

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class MySportConfig {

}

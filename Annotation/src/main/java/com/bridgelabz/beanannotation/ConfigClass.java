package com.bridgelabz.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bridgelabz.component.Principal;
@Configuration
@ComponentScan(basePackages="com.bridgelabz.beanannotation")
@PropertySource("classpath:collegeName.properties")
public class ConfigClass
{  
	
//	@Bean 
//	public Teacher mathTeacherBean()
//	{
//		return new MathTeacher();
//		
//	}
//  
//	@Bean
//	public Principal principalBean() 
//	{
//		return new Principal();
//	}
//	
//	
//	@Bean(name="college")     //collegeBean=bean id
//	
//	public College collegeBean() 
//	{
//		College college =new College();
//		college.setPrincipal(principalBean());
//		college.setTeacher(mathTeacherBean());
//		return college;
//	}
}

package com.bridgelabz.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bridgelabz.component.Principal;

public class ConfigClass
{
  
	@Bean
	public Principal principalBean() 
	{
		return new Principal();
	}
	
	
	@Bean(name="college")     //collegeBean=bean id
	
	public College collegeBean() 
	{
		College college =new College(principalBean());
		return college;
	}
}

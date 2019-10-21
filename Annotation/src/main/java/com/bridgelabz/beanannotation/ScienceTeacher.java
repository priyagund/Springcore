package com.bridgelabz.beanannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ScienceTeacher implements Teacher
{

	@Override
	public void teach() {
		
    System.out.println("i am science teacher");
    System.out.println("My name is Dipali");
	}

}

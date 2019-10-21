package com.bridgelabz.beanannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher
{

	@Override
	public void teach() {
		
    System.out.println("i am math teacher");
    System.out.println("My name is Yashashree");
	}

}

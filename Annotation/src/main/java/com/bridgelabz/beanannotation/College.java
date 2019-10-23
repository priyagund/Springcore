package com.bridgelabz.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.bridgelabz.component.Principal;
@Component
public class College 
{   
	@Value("${college.Name}")
	private String collegeName;
	
	@Autowired 
	@Qualifier("scienceTeacher")  //if more than one object is present in container call perticular object
	private Teacher teacher;
	
	@Autowired
	private PrincipalCol  principal; 
//  
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
//
//public void setPrincipal(Principal principal) {
//		this.principal = principal;
//	}
//
public void test() 
{     
	 principal.principalInfo();
	 teacher.teach();
	 System.out.println("my college name is"+collegeName);
	 System.out.println("test is done");
}

}

/******************************************************************************
*  Purpose:spring framework using annotation main class 
*
*  @author priyanka gund
*  @version 1.0
*  @since   23-10-2019
*
******************************************************************************/

package bridgelabz.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
 public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    System.out.println("configure loaded");
	Sim sim=context.getBean("sim", Airtel.class);
	 sim.calling();
	 sim.data();

}
}

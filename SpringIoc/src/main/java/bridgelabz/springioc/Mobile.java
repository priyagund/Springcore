package bridgelabz.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
 public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	Sim sim=context.getBean("sim", Airtel.class);
	 sim.calling();
	 sim.data();

}
}
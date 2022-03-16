package spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class aopMain {

	public static void main(String[] args) {
		AbstractApplicationContext context
		= new GenericXmlApplicationContext("aopTest.xml");

		GreetingService greeting = context.getBean("greeting",GreetingService.class);
		
		greeting.sayHelllo("su");
		try {
			greeting.sayGoodbye("su");
		} catch (Exception e) {
			/* e.printStackTrace(); */
		}
	}

}

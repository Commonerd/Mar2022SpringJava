package spring.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnoMain {

	public static void main(String[] args) {
		AbstractApplicationContext context
		= new GenericXmlApplicationContext("annoTest.xml");
		Foo f = context.getBean("foo", Foo.class);
				f.doFoo();
		
		context.registerShutdownHook();
	}
}

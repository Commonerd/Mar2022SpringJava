package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context
		= new GenericXmlApplicationContext("applicationContext.xml");
		Foo f = context.getBean("foo",Foo.class);
		f.doFoo();
		
		Fooo fo = context.getBean("fooo", Fooo.class);
		fo.doFooo();
	}

}

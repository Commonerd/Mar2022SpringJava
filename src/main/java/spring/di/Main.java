package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//컨테이너생성
		AbstractApplicationContext context
		= new GenericXmlApplicationContext("applicationContext.xml");
		Foo f = context.getBean("foo1",Foo.class);
		f.doFoo();
		
		context.registerShutdownHook(); //컨테이너 강제종료-> 그안에 있는 객체빈들이 소멸된다~
		
		/*
		 * Fooo fo = context.getBean("foo", Fooo.class); fo.doFooo();
		 * 
		 * CollectionTest ct = context.getBean("colls", CollectionTest.class);
		 * System.out.println(ct);
		 */
		 
	}

}

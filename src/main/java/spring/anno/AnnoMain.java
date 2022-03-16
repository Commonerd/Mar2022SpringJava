package spring.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AnnoMain {

	public static void main(String[] args) {
		AbstractApplicationContext context
		= new GenericXmlApplicationContext("annoTest.xml");
		System.out.println("-----------------------");
		Foo f = context.getBean("foo", Foo.class);
		f.doFoo();
		System.out.println("-----------------------");
		Foo smith = context.getBean("activeFoo",Foo.class); //빈의 이름이 없어서 메서드 이름이 빈의 이름이 된 것.
		smith.doFoo();
		System.out.println("-----------------------");
		context.registerShutdownHook();
	}
}

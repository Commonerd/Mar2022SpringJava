package spring.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Foo {

	@Autowired
	Bar bar;
	@Qualifier("tiger")
	@Value("scott")
	String name;

	public void doFoo() {
		System.out.println(name + "::Foo.doFoo()실행");
		bar.doBar();
	}
	@PostConstruct
	public void start() {
		System.out.println(name + "::Foo.start");
	}
	@PreDestroy
	public void stop() {
		System.out.println(name + "::Foo.stop()");
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setName(String name) {
		this.name = name;
	}

}

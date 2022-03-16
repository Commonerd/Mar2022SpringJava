package spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Baz {

	@Bean
	public Foo activeFoo() {
		System.out.println("Baz.activeFoo() 실행");
		Foo smith = new Foo();
		smith.setName("smith");
		return smith; //컨테이너에 등록 -> 빈이 됨 -> 빈이 되니까, 그 시점..
	}
}

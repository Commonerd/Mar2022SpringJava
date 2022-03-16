package spring.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	@Value("component생성")
	String str;
	
	public void doBar() {
		System.out.println("Bar.doBar() 실행");
	
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	

}

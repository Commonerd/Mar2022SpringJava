package spring.di;

import java.util.*;

public class CollectionTest {

	List<String> greetings;// "hi","hello"순서대로 저장
	Map<Integer, String> map;// 1-"scott", 2- "tiger" 저장
	Properties p;// username="c##javakim", password="javakim"저장
	
	public void setGreetings(List<String> greetings) {
		this.greetings = greetings;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public void setP(Properties p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "CollectionTest [greetings=" + greetings + ", map=" + map + ", p=" + p + "]";
	}
	
	

}

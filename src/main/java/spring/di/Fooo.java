package spring.di;

public class Fooo {
	Bar bar;
	
	public void doFooo() {
		System.out.println("Foooo.doFooo() 실행");
		bar = getBar();
		bar.doBar();
	}
	//look up 메서드 선언
	public Bar getBar() {
		return null; // 컨테이너에 저장된 Bar타입 객체를 리턴
	}

}


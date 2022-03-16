package spring.aop;

public class GreetingServiceImpl implements GreetingService{

		private String greeting;
		
		
	public void setGreeting(String greeting) {
			this.greeting = greeting;
		}

	public void sayHelllo(String name) {
		System.out.println("sayHello : "+greeting+" : "+name);
	}

	public void sayGoodbye(String name) throws Exception {
		System.out.println("sayGoodbye : "+greeting+" : "+name);
		throw new Exception("강제 예외 발생");
	}

}

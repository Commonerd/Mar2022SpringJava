package spring.di;

public class Foo {
		Bar bar;
		Baz baz;
		
		String str;
		int i;
		
		
		public Foo() {}	
		public Foo(Bar bar, Baz baz) {
			super();
			this.bar = bar;
			this.baz = baz;
		}
		public Foo(Bar bar, Baz baz, String str, int i) {
			super();
			this.bar = bar;
			this.baz = baz;
			this.str = str;
			this.i = i;
		}
		public void setBar(Bar bar) {
			this.bar = bar;
		}
		public void setBaz(Baz baz) {
			this.baz = baz;
		}
		public void setStr(String str) {
			this.str = str;
		}
		public void setI(int i) {
			this.i = i;
		}
		public void doFoo() {
			System.out.println("str : "+str+" i: "+i);
			System.out.println(("Foo.doFoo() 실행"));
			bar.doBar();
		}
}

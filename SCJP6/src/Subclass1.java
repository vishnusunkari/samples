class A{
	void foo() throws Exception {
			throw new Exception();
	}
}
class SubB2 extends A {
	void foo(){
		System.out.println("B");
	}
}
public class Subclass1 {	
	public static void main(String[] args) throws Exception{
		A a = new SubB2();
		a.foo();
	}
}

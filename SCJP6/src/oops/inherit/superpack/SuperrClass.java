package oops.inherit.superpack;

public class SuperrClass {
	public String publicstr = "PUBLIC STRING";
	protected String protectstr = "PROTECT STRING";
	private String privatestr = "PRIVATE STRING";
	String defaultstr = "DEFAULT STRING";
	
	//Access modifier demo
	public void superClassMethod(){
		System.out.println("publicstr: " + publicstr);
		System.out.println("protectstr: " + protectstr);
		System.out.println("defaultstr: " + defaultstr);
		System.out.println("privatestr: " + privatestr);
	}
	
	//Visibility of methods demo
	void superClassMethod2(){
		System.out.println("publicstr: " + publicstr);
 		System.out.println("defaultstr: " + defaultstr);
		System.out.println("privatestr: " + privatestr);
	} 
}

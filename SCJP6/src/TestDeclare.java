import java.io.Console;

interface DeclareStuff{
	public static final int EASY=3;
	void doStuff(int t);
}

public class TestDeclare implements DeclareStuff {
	public static void main(String[] args) {
		int x=5;
		Console c = System.console();
		char[] pw = c.readPassword("%s", "pw: ");
		System.out.println("got pw: " + pw);
		String name = c.readLine("%s", "name: ");
		System.out.println("got name: "+ name);
		//new TestDeclare().doStuff(++x);
	}
	public void doStuff(int s){
		s +=EASY + ++s;
		System.out.println("s: " + s);
	}

}

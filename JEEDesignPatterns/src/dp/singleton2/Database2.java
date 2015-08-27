package dp.singleton2;
/*
 * Singleton Approach1
 * A privileged client can invoke the private constructor reflectively
 * (Item 53) with the aid of the AccessibleObject.setAccessible method. If you
 * need to defend against this attack, modify the constructor to make it throw an
 * exception if it’s asked to create a second instance.
 */
public class Database2 {
	public static final Database2 database2 = new Database2();
	private Database2(){
		
	}
	public void someMethod(){ 
		
	}
}

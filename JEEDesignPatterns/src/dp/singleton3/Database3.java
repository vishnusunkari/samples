package dp.singleton3;

/*
 * second approach to implementing singletons, 
 * the public member is a static factory method
 */

public class Database3 {
	private static final Database3 database3 = new Database3();
	private Database3(){
		
	}
	public static Database3 getInstance(){ 
		return database3;
	}
	
	public void someMethod(){
		
	}
}

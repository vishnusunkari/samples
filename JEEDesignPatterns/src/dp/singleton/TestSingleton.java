package dp.singleton;
public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Database database1;
		database1 = Database.getInstance("products");
		System.out.println("database1: " + database1);
		Database database2;
		database2 = Database.getInstance("employees");
		System.out.println("database2: " + database2);
		Database database3;

		//database3 = (Database) database2.clone();
		//System.out.println("database3: " + database3);
		
		/*Database db4 = Database.getInstance2("str1");
		Database db5 = Database.getInstance2("str2");
		Database db6 = Database.getInstance2("str3");
		
		System.out.println("db4: " + db4);
		System.out.println("db5: " + db5);
		System.out.println("db6: " + db6);*/
		

	}
}

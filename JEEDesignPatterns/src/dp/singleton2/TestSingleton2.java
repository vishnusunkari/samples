package dp.singleton2;

public class TestSingleton2 {

	public static void main(String[] args) {
		Database2 db1 = Database2.database2;
		Database2 db2 = Database2.database2;
		
		System.out.println("db1 : " + db1);
		System.out.println("db2 : " + db2);

	}

}

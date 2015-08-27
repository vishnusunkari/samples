package dp.singleton3;

public class TestSingleton3 {

	public static void main(String[] args) {
		Database3 db1 = Database3.getInstance();
		Database3 db2 = Database3.getInstance();
		
		System.out.println("db1 : " + db1);
		System.out.println("db2 : " + db2);
	}
}

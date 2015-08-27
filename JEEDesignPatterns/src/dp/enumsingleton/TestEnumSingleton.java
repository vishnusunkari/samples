package dp.enumsingleton;

public class TestEnumSingleton {

	public static void main(String[] args) {

		Database db1 = Database.INSTANCE;
		db1.setName("products");
		System.out.println("db1: " + db1);
		System.out.println("db1 record: " + db1.getRecord());
		System.out.println("db1 name: " + db1.getName());
		System.out.println("db1 car: " + db1.getCar());
		Database db2 = Database.INSTANCE;
		db1.setName("str2");
		System.out.println("db2: " + db2);
		System.out.println("db2 record: " + db2.getRecord());
		System.out.println("db2 name: " + db2.getName());
		System.out.println("db2 car: " + db2.getCar());
		System.out.println("db1 name: " + db1.getName());
	}

}

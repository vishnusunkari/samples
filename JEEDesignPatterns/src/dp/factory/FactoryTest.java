package dp.factory;

public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstFactory factory = new FirstFactory("other");
		Connection connection = factory.createConnection();
		System.out.println("You are connecting to: " + connection.description());
        
		/*
			Connection connection;
			if(type.equals("Oracle")) {
				connection = new OracleConnection();
			} else if(type.equals("SqlServer")) {
				connection = new SqlServerConnection();
			} else {
				connection = new MySqlConnection();
			}
		*/
		
	}

}

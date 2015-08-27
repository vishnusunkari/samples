package dp.factory;

public class FirstFactory {

	protected String type;
	public FirstFactory(String t){
		type = t;
	}
	public Connection createConnection(){
		if(type.equals("Oracle")){
			return new OracleConnection();
		} else if(type.equals("SqlServer")){
			return new SqlServerConnection();
		} else if(type.equals("MySql")){
			return new MySqlConnection();
		} else {
			return new Connection(){};
		}
	}	
}

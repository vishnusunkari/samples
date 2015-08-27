package dp.observer;

public class Client implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Client: " + operation + ", on " + record);
	}

}

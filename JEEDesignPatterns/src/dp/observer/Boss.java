package dp.observer;

public class Boss implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Boss: " + operation + ", on " + record);
	}

}

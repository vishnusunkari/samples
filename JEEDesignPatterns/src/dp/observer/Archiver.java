package dp.observer;

public class Archiver implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Archiver: " + operation + ", on " + record);
	}

}

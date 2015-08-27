package dp.strategy;

public class Car extends Vehicle {

	public Car(){
		setGo(new GoByDriving());
	}
}

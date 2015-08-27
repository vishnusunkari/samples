package dp.strategy;

public class SuperCar extends Vehicle {
	public SuperCar(){
		setGo(new GoByDrivingFast());
	}
	 
}

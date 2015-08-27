package dp.strategy;

public class Helicopter extends Vehicle {
	public Helicopter(){
		setGo(new GoByFlying());
	}
}

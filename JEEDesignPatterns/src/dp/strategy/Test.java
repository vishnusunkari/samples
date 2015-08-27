package dp.strategy;

public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		SuperCar supercar = new SuperCar();
		Helicopter helicopter = new Helicopter();
		car.go();
		supercar.go();
		helicopter.go();
	}
}

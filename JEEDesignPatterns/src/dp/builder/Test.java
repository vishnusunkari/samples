package dp.builder;

public class Test {
	public static void main(String[] args) {
		Cook cook = new Cook();
		PizzaBuilder veggiePizzaBuilder = new VeggiePizzaBuilder();
		PizzaBuilder chickenPizzaBuilder = new ChickenPizzaBuilder();
		
		cook.setPizzaBuilder(chickenPizzaBuilder);
		cook.constructPizza();
		Pizza pizza = cook.getPizza();
		System.out.println(pizza.description());

	}

}

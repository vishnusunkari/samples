package dp.builder;

/**Concrete PizzaBuilder */
public class VeggiePizzaBuilder extends PizzaBuilder {
	public void buildDough() {
		pizza.setDough("soft maida");
	}
	public void buildSauce() {
		pizza.setSauce("tomato sauce");
	}
	public void buildTopping() {
		pizza.setTopping("tomoto+black_olives+pineapple");
	}

}

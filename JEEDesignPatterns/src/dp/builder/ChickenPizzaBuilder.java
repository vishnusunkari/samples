package dp.builder;

/**Concrete PizzaBuilder */
public class ChickenPizzaBuilder extends PizzaBuilder {
	public void buildDough() {
		pizza.setDough("hard maida");
	}
	public void buildSauce() {
		pizza.setSauce("buffalo sauce");
	}
	public void buildTopping() {
		pizza.setTopping("chicken+jalapenos+onions");
	}
}

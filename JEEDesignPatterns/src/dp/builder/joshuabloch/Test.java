package dp.builder.joshuabloch;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
									calories(100).carbohydrate(27).build();

		System.out.println("Cocacola Nutrition Facts : ");
		System.out.println(cocaCola.toString());
	}

}

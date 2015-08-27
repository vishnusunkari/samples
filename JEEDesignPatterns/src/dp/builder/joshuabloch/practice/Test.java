package dp.builder.joshuabloch.practice;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NutritionFacts nf = new NutritionFacts.Builder(200, 100).calories(100).fat(40).sodium(20).build();
		System.out.println(nf.toString());
	}

}

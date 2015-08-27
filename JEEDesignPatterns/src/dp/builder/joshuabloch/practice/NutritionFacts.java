package dp.builder.joshuabloch.practice;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int sodium;
	private final int fat;
	private final int carbohydrate;
	
	private NutritionFacts(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		sodium = builder.sodium;
		fat = builder.fat;
		carbohydrate = builder.carbohydrate;
	}
	
	public static class Builder{
		//required
		private final int servingSize;
		private final int servings;
		//optional
		private  int calories;
		private  int sodium;
		private  int fat;
		private  int carbohydrate;
		
		public Builder(int servingSize, int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val){
			calories = val;
			return this;
		}
		
		public Builder sodium(int val){
			sodium = val;
			return this;
		}
		public Builder fat(int val){
			fat = val;
			return this;
		}
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}
	
	public String toString() {
		return "Serving Size: " + servingSize + 
				"\nServings: " + servings +
				"\nCalories: " + calories +
				"\nFat: " + fat + 
				"\nSodium: " + sodium + 
				"\nCarbohydrate: " + carbohydrate;
	}
	
}

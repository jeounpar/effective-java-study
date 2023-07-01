package item02;

public class Item02Main {
	public static void main(String[] args) {
		NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8)
				.calories(100).sodium(35).carbohydrate(27).build();
		System.out.println("nutritionFacts.getServingSize() = " + nutritionFacts.getServingSize());
		System.out.println("nutritionFacts.getServings() = " + nutritionFacts.getServings());
		System.out.println("nutritionFacts.getCalories() = " + nutritionFacts.getCalories());
		System.out.println("nutritionFacts.getSodium() = " + nutritionFacts.getSodium());
		System.out.println("nutritionFacts.getCarbohydrate() = " + nutritionFacts.getCarbohydrate());
		System.out.println("nutritionFacts.getFat() = " + nutritionFacts.getFat());
	}
}

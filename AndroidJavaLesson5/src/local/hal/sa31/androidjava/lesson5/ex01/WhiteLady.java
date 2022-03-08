package local.hal.sa31.androidjava.lesson5.ex01;

public class WhiteLady
{
	public static void main(String[] args)
	{
		// Ingredient ing = new Ingredient("ジン", 1.5, 30);

		Cocktail whiteLady = new Cocktail("ホワイトレディ―");

		whiteLady.addIngredient("ジン", 1.5, 30);
		whiteLady.addIngredient("コアントロー", 4.0, 15);
		whiteLady.addIngredient("レモン果汁", 2.0, 15);

		System.out.println(whiteLady.getRecipe());
		System.out.println("原価は" + whiteLady.getCost() + "円");
	}
}

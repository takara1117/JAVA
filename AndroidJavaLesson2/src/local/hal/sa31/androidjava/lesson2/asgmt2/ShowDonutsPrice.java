package local.hal.sa31.androidjava.lesson2.asgmt2;

public class ShowDonutsPrice
{
	public static void main(String[] args) 
	{
		Donuts price = new Donuts("オールドファッション" ,120 ,3);
		price.showOrder();
		
		DonutsWithDrink prices = new DonutsWithDrink("チョコファッション", 140, 2, "アイスコーヒー" ,350);
		prices.showOrder();
	}
}
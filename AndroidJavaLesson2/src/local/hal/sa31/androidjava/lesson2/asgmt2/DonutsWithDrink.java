package local.hal.sa31.androidjava.lesson2.asgmt2;

public class DonutsWithDrink extends Donuts
{
	public String _drinkName;
	
	public int _drinkPrice;
	
	public DonutsWithDrink(String name, int price, int quantity, String drinkName, int drinkPrice)
	{
		super(name, price, quantity);
		_drinkName = drinkName;
		_drinkPrice= drinkPrice; 
	}
	
	public int getPriceWithDrink()
	{
		int drinkPrice = getTotalDonutsPrice() + _drinkPrice;
		return drinkPrice;
	}
	
	@Override
	public void showOrder()
	{
		super.showOrder();
		int total = getPriceWithDrink();
		System.out.println("ドーナツと" + _drinkName + "とのセットで合計" + total + "円");
	}
}

package local.hal.sa31.androidjava.lesson2.asgmt2;

public class Donuts 
{
	private String _name;
	
	private int _price = 0;
	
	private int _quantity = 0;
	
	public Donuts(String name, int price, int quantity)
	{
		_name = name;
		
		_price = price;
		
		_quantity = quantity;
	}

	public int getTotalDonutsPrice()
	{
		int donutsPrice = _price * _quantity;
		return donutsPrice;
	}
	
	public void showOrder()
	{
		int price = _price * _quantity;
		System.out.println(_name + "が" + _quantity + "個で合計" + price + "円");
	}
}

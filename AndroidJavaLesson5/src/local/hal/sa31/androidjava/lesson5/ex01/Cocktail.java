package local.hal.sa31.androidjava.lesson5.ex01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Cocktail
{
	private class Ingredient
	{
	
		private String _name;
		
		private double _price;
		
		private int _quantity;

		public Ingredient(String name, double price, int quantity)
		{
			_name = name;
			_price = price;
			_quantity = quantity;
		}

		public int getCost()
		{
			BigDecimal bigCost = new BigDecimal(_price * _quantity);
			bigCost = bigCost.setScale(0, RoundingMode.HALF_UP);
			return bigCost.intValue();
		}

		//以下ゲッタ。

		public String getName()
		{
			return _name;
		}

		public double getPrice()
		{
			return _price;
		}

		public int getQuantity()
		{
			return _quantity;
		}
	}

	//材料リスト
	private ArrayList<Ingredient> _ingredients = new ArrayList<Ingredient>();
	
	//カクテル名
	private String _name;

	//コンストラクタ カクテル名
	public Cocktail(String name)
	{
		_name = name;
	}

	//カクテルの材料を登録するメソッド
	public void addIngredient(String name, double price, int quantity)
	{
		Ingredient ingredient = new
		Ingredient(name, price, quantity);
		_ingredients.add(ingredient);
	}

	//このカクテルのレシピを得るメソッド
	public String getRecipe()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(_name);
		sb.append("のレシピ:\n");

		for (Ingredient ing : _ingredients)
		{
			sb.append(ing.getName());
			sb.append(": ");
			sb.append(ing.getQuantity());
			sb.append("ml\t");
		}

		return sb.toString();
	}

	//原価を計算するメソッド
	public int getCost()
	{
		int cost = 0;

		for (Ingredient ing : _ingredients)
		{
			cost += ing.getCost();
		}

		return cost;
	}
}

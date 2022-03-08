package local.hal.sa31.androidjava.lesson4.ex02;

import java.util.HashSet;
import java.util.Set;

public class UseSet
{
	public static void main(String[] args)
	{ 
		Set<Integer> stock = new HashSet<>(); 
		
		stock.add(54); 
		stock.add(24); 
		stock.add(47); 
		stock.add(0); 
		stock.add(6); 
		stock.add(24); 
		stock.add(85); 
		stock.add(1); 
		stock.add(5); 
		stock.add(6); 
		stock.add(98); 
		stock.add(47); 
		stock.add(54); 
		stock.add(96); 
		stock.add(9); 
		
		System.out.println("要素は" + stock.size() + "コです。"); 
		System.out.println("--------- 中身を見てみよう ---------");
		
		for (Integer element : stock)
		{ 
			System.out.println(element); 
		} 
	} 

}

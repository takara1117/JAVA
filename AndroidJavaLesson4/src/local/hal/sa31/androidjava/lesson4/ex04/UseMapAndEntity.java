package local.hal.sa31.androidjava.lesson4.ex04; 

import java.util.HashMap;
import java.util.Map;

public class UseMapAndEntity 
{
	public static void main(String[] args) 
	{ 
		Map<Integer, PersonalData> stock = new HashMap<>(); 
		
		PersonalData taro = new PersonalData(); 
		taro.setId(46887); 
		taro.setName("Taro"); 
		taro.setWeight(72.8); 
		taro.setHeight(167.3); 
		taro.setAge(23); 
		taro.setSex(1); 
		stock.put(46887, taro); 
		
		PersonalData jiro = new PersonalData(); 
		jiro.setId(12457); 
		jiro.setName("Jiro"); 
		jiro.setWeight(57.7); 
		jiro.setHeight(170.4); 
		jiro.setAge(28); 
		jiro.setSex(1); 
		stock.put(12457, jiro); 
		
		PersonalData hanako = new PersonalData(); 
		hanako.setId(63544); 
		hanako.setName("Hanako"); 
		hanako.setWeight(53.1); 
		hanako.setHeight(155.4); 
		hanako.setAge(19); 
		hanako.setSex(0); 
		stock.put(63544, hanako); 
		
		PersonalData keisuke = new PersonalData(); 
		keisuke.setId(34544); 
		keisuke.setName("Keisuke"); 
		keisuke.setWeight(98.4); 
		keisuke.setHeight(192.4); 
		keisuke.setAge(35); 
		keisuke.setSex(1); 
		stock.put(34544, keisuke); 
		
		System.out.println("要素は" + stock.size() + "コです。"); 
		System.out.println("--------- 中身を見てみよう ---------");
		
		for (Map.Entry<Integer, PersonalData> element : stock.entrySet()) 
		{ 
			Integer key = element.getKey(); 
			PersonalData person = element.getValue(); 
		
			StringBuffer sbCurry = new StringBuffer(); 
			sbCurry.append("会員ID "); 
			sbCurry.append(key); 
			sbCurry.append(" の人: "); 
			sbCurry.append("名前="); 
			sbCurry.append(person.getName()); 
			sbCurry.append("; "); 
			sbCurry.append("身長="); 
			sbCurry.append(person.getHeight()); 
			sbCurry.append("cm; "); 
			sbCurry.append("体重="); 
			sbCurry.append(person.getWeight()); 
			sbCurry.append("kg");

			System.out.println(sbCurry.toString()); 
		} 
	} 

}

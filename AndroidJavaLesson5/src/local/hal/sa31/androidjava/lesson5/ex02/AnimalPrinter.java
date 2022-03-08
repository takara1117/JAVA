package local.hal.sa31.androidjava.lesson5.ex02;

public class AnimalPrinter
{
	
	public void print(AnimalInterface animal)
	{
		System.out.println("----- 表示します");
		String name = animal.getName();
		String call = animal.call();

		System.out.println(name + "は" + call);
	}
}

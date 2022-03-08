package local.hal.sa31.androidjava.lesson5.ex03;

public class AnimalPrinter
{	
	interface AnimalInterface
	{
		String getName();
		
		String call();
	}

	public void print(AnimalInterface animal)
	{
		System.out.println("----- 表示します");
		String name = animal.getName();
		String call = animal.call();

		System.out.println(name + "は" + call);
	}
}

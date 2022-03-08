package local.hal.sa31.androidjava.lesson5.ex04;

public class AnimalPrinter
{
	@FunctionalInterface
	interface AnimalInterface
	{
		String call(String name);
	}

	public void print(String name, AnimalInterface animal)
	{
		System.out.println(animal.call(name));
	}
}

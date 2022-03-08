package local.hal.sa31.androidjava.lesson5.ex04;

public class CatPigPrinter
{	
	public void doPrint()
	{
		AnimalPrinter printer = new AnimalPrinter();

		AnimalPrinter.AnimalInterface cat = new AnimalPrinter.AnimalInterface()
		{
			@Override
			public String call(String name)
			{
				return name + "の鳴き声はわんわん";
			}
		};

		printer.print("猫", cat);

		AnimalPrinter.AnimalInterface pig = (String name) ->
		{
			return name + "の鳴き声はぶうぶう";
		};

		printer.print("豚", pig);

		printer.print("犬", (String name) ->
		{
			return name + "の鳴き声はわんわん";
		});
	}
}

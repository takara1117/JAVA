package local.hal.sa31.androidjava.lesson5.ex02;

public class CatPigPrinter
{
	
	public void doPrint()
	{
		AnimalPrinter printer = new AnimalPrinter();

		Cat cat = new Cat();
		printer.print(cat);

		printer.print(new Pig());
	}

	private class Cat implements AnimalInterface
	{
		@Override
		public String getName() 
		{
			return "たま";
		}

		@Override
		public String call() 
		{
			return "にゃあ";
		}
	}

	
	private class Pig implements AnimalInterface 
	{
		@Override
		public String getName()
		{
			return "とんこ";
		}

		@Override
		public String call()
		{
			return "ぶうぶう";
		}
	}
}

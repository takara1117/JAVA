package local.hal.sa31.androidjava.lesson5.ex02;

public class CatPigPrinter2 
{
	public void doPrint() 
	{
		AnimalPrinter printer = new AnimalPrinter();

		AnimalInterface cat = new AnimalInterface()
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
		};

		printer.print(cat);

		printer.print(new AnimalInterface()
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
		});
	}
}

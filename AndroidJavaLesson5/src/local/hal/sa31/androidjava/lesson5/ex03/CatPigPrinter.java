package local.hal.sa31.androidjava.lesson5.ex03;

public class CatPigPrinter
{
	public void doPrint()
	{
		AnimalPrinter printer = new AnimalPrinter();
		printer.print(new Cat());

		printer.print(new AnimalPrinter.AnimalInterface()
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

	private class Cat implements AnimalPrinter.AnimalInterface
	{
		@Override
		public String getName()
		{
			return "たま";
		}

		@Override
		public String call(){
			return "にゃあ";
		}
	}
}

package local.hal.sa31.androidjava.lesson5.ex02;

public class CallAnimals
{
	public static void main(String[] args)
	{
		CatPigPrinter printer = new CatPigPrinter();
		printer.doPrint();

		CatPigPrinter2 printer2 = new CatPigPrinter2();
		printer2.doPrint();
	}
}

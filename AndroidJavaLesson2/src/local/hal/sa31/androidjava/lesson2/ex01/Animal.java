package local.hal.sa31.androidjava.lesson2.ex01;

public class Animal
{
	private String _name;
    
    public void setName(String name) 
    {
    	 _name = name;
    }

    public String getName()
    {
         return _name;
    }

    public String call()
    {
         return "どんな鳴き声?";
    }

    public void speak()
    {
         System.out.println("いえい!");
    }
}
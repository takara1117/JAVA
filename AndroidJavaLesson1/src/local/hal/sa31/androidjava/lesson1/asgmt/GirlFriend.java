package local.hal.sa31.androidjava.lesson1.asgmt;

public class GirlFriend {
	private String _name;
	
	private int _birthYear;
	
	private int _birthMonth;
	
	private int _birthDay;
	
	public GirlFriend(String name, int birthYear, int birthMonth, int birthDay)
	{
		_name = name;
		_birthYear = birthYear;
		_birthMonth = birthMonth;
		_birthDay = birthDay;
	}
	
	public boolean isBirthMonth(int month)
	{
	  if (month == _birthMonth) 
	  {
	    return true;
    } 
	  else 
      {
	    return false;
	  }
	}
	
	public int getAge(int $year)
    {
      return $year - _birthYear;
    }
	
	public String getName()
    {
      return _name;
    }
	
	public int getBirthYear()
    {
      return _birthYear;
    }

    public int getBirthMonth()
    {
      return _birthMonth;
    }

    public int getBirthDay()
    {
      return _birthDay;
    }
}

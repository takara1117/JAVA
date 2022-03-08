package local.hal.sa31.androidjava.lesson4.ex04;

public class PersonalData
{
	private Integer _id; 
 
	private String _name; 

	private Double _weight; 

	private Double _height; 

	private Integer _age; 

	private Integer _sex; 
	
	//以下アクセサリメソッド
	public Integer getId() 
	{ 
		return _id; 
	} 

	public void setId(Integer id)
	{ 
		_id = id; 
	} 

	public String getName() 
	{ 
		return _name; 
	} 

	public void setName(String name) 
	{ 
		_name = name; 
	} 

	public Double getWeight() 
	{ 
		return _weight; 
	} 

	public void setWeight(Double weight) 
	{ 
		_weight = weight; 
	} 

	public Double getHeight() 
	{ 
		return _height; 
	} 

	public void setHeight(Double height) 
	{ 
		_height = height; 
	} 

	public Integer getAge() 
	{ 
		return _age; 
	} 

	public void setAge(Integer age) 
	{ 
		_age = age; 
	} 

	public Integer getSex() 
	{ 
		return _sex; 
	} 

	public void setSex(Integer sex) 
	{
		_sex = sex; 
	} 

}

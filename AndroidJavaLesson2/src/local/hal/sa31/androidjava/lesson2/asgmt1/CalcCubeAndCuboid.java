package local.hal.sa31.androidjava.lesson2.asgmt1;

public class CalcCubeAndCuboid
{
	
	private double _height = 0;

	private double _width = 0;

	private double _depth = 0;

	public CalcCubeAndCuboid(double height, double width, double depth)
	{
		_height = height;
		 
		_width = width; 
		
		_depth = depth;
	}
	
	public CalcCubeAndCuboid(double height)
	{
		this(height, height, height);
	}
	
	public double getArea()
	{
		double area = (2 * _height * _width) + (2 * _width * _depth) + (2 * _height * _depth);
		return area;
	}
		
	public double getVolume()
	{
		double volume = _height * _width * _depth;
		return volume;
	}

}

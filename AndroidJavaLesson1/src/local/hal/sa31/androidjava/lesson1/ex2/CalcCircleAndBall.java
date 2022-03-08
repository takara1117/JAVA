package local.hal.sa31.androidjava.lesson1.ex2;
public class CalcCircleAndBall {
	private double _radius = 0;
	
	private static final double PI = 3.14;
	
	public CalcCircleAndBall(double radius) {
		_radius = radius;
	}
	
	public double getRadius() {
		return _radius;
	}
	
	public double getCircle() {
		double circle = 2 * PI * _radius;
		return circle;
	}
	
	public double getArea() {
		double area = PI * _radius * _radius;
		return area;
	}
	
	public double getSurface() {
		double surface = 4 * PI * _radius * _radius;
		return surface;
	}
	
	public double getVolume() {
		double volume = 4 * PI * _radius * _radius * _radius / 3;
		return volume;
	}
}

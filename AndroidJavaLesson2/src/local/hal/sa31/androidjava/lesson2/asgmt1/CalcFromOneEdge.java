package local.hal.sa31.androidjava.lesson2.asgmt1;

public class CalcFromOneEdge
{
	public static void main(String[] area)
	{
		double[] rList = {1.5, 3.2, 5.8, 7.4, 9.7};
		for(double height: rList) {
			CalcCubeAndCuboid cube = new CalcCubeAndCuboid(height);
			System.out.println(" ■■■■ 一辺 " + height + "の計算結果");
			System.out.println(" 表面積: " + cube.getArea() + " | 体積: " + cube.getVolume());
			
			CalcCubeAndCuboid Rectangular = new CalcCubeAndCuboid(height, height * 4, height * 8);
			System.out.println(" 横:" + height * 4 + "奥行き:" + height * 8 + "の" + "直方体の表面積: " + Rectangular.getArea() + " | 体積: " + Rectangular.getVolume());
		}
	}
}

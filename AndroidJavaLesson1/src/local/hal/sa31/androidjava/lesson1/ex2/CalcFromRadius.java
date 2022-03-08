package local.hal.sa31.androidjava.lesson1.ex2;
public class CalcFromRadius {
	public static void main(String[] area) {
		double[] rList = {1, 3, 5, 7, 9};
		for(double radius: rList) {
			CalcCircleAndBall calc = new CalcCircleAndBall(radius);
			System.out.println("■■■ 半径 " + radius + "の計算結果");
			System.out.print("円周: " + calc.getCircle());
			System.out.print(" | 円面積: " + calc.getArea());
			System.out.print(" | 球面積: " + calc.getSurface());
			System.out.println(" | 球体積: " + calc.getVolume());
		}
	}
}
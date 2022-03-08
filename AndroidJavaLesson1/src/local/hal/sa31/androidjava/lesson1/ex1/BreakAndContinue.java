package local.hal.sa31.androidjava.lesson1.ex1;
public class BreakAndContinue {
	public static void main(String[] ards) {
		int[] numes = new int[5];
		int[] denomis = new int[5];
		for(int i = 0; i<= 4; i++) {
			numes[i] = (int) (Math.random() * 10);
			denomis[i] = (int) (Math.random() * 10);
		}
		for(int denomi: denomis) {
			System.out.println("■分母の値: " + denomi);
			if(denomi == 0) {
				System.out.println("分母の値が0なので処理を中止します");
				break;
			}
			for(int nume: numes) {
				System.out.println("--分子の値: " + nume);
				if(nume == 0) {
					System.out.println("->分子が0なので次の分子にスキップします");
					continue;
				}
				double ans = (double) nume / denomi;
				System.out.println("->分数値: " + ans);
			}
		}
	}
}

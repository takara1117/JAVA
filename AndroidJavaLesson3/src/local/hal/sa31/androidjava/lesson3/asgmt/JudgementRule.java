package local.hal.sa31.androidjava.lesson3.asgmt;

/**
 * SA31 Android用Java文法 Lesson3 課題4
 *
 * 合否判定ロジックインターフェース。
 *
 * @author Shinzo SAITO
 */
public interface JudgementRule {
	/**
	 * 合否を判定するメソッド。
	 *
	 * @param totalScore 合計点。
	 * @return 合格ならtrue、不合格ならfalse。
	 */
	boolean judge(int totalScore);
}

package local.hal.sa31.androidjava.lesson3.asgmt;

/**
 * SA31 Android用Java文法 Lesson3 課題4
 *
 * 学生の点数と合否判定ロジックを利用して合否判定を行うクラス。
 *
 * @author Shinzo SAITO
 */
public abstract class AbstractJudgement {
	/**
	 * 合否判定ロジックが記述されたオブジェクトフィールド。
	 */
	private JudgementRule _rule;

	/**
	 * コンストラクタ。
	 *
	 * @param rule 合否判定ロジックが記述されたオブジェクト。
	 */
	public AbstractJudgement(JudgementRule rule) {
		_rule = rule;
	}

	/**
	 * 学生の点数を表すオブジェクトを生成するメソッド。
	 *
	 * @return 学生の点数を表すオブジェクト。
	 */
	protected abstract ScoreHolder createScoreHolder();

	/**
	 * 合否結果を表示するメソッド。
	 */
	public void judge() {
		ScoreHolder score = createScoreHolder();
		int totalScore = score.getTotalScore();
		boolean result = _rule.judge(totalScore);
		String resultStr = "不合格";
		if(result) {
			resultStr = "合格";
		}
		String resultMsg = score.getName() + "さんの総合計は" + totalScore + "点で、結果は" + resultStr + "です。";
		System.out.println(resultMsg);
	}
}

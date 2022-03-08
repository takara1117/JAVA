package local.hal.sa31.androidjava.lesson3.asgmt;

/**
 * SA31 Android用Java文法 Lesson3 課題4
 *
 * 学生の点数を保持するクラス。
 *
 * @author Shinzo SAITO
 */
public class ScoreHolder {
	/**
	 * 学生名を表すフィールド。
	 */
	private String _name;
	/**
	 * SA科目の点数を表すフィールド。
	 */
	private int _sa;
	/**
	 * PH科目の点数を表すフィールド。
	 */
	private int _ph;
	/**
	 * JV科目の点数を表すフィールド。
	 */
	private int _jv;

	/**
	 * コンストラクタ。
	 *
	 * @param name 学生名。
	 * @param sa SA科目の点数。
	 * @param ph PH科目の点数。
	 * @param jv JV科目の点数。
	 */
	public ScoreHolder(String name, int sa, int ph, int jv) {
		_name = name;
		_sa = sa;
		_ph = ph;
		_jv = jv;
	}

	/**
	 * 科目の合計点を取得するメソッド。
	 *
	 * @return 合計点。
	 */
	public int getTotalScore() {
		return _sa + _ph + _jv;
	}

	/**
	 * 学生名を取得するメソッド。
	 *
	 * @return 学生名。
	 */
	public String getName() {
		return _name;
	}
}

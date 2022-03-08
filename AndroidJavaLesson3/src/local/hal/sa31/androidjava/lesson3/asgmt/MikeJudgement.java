package local.hal.sa31.androidjava.lesson3.asgmt;

public class MikeJudgement extends AbstractJudgement
{
	public MikeJudgement(JudgementRule rule)
	{
		super(rule);
	}

	@Override
	protected ScoreHolder createScoreHolder()
	{
		ScoreHolder total = new ScoreHolder("マイク", 48, 56, 53);
		return total;
	}
}

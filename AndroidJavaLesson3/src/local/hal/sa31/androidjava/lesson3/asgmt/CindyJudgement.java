package local.hal.sa31.androidjava.lesson3.asgmt;

public class CindyJudgement extends AbstractJudgement
{
	public CindyJudgement(JudgementRule rule)
	{
		super(rule);
	}

	@Override
	protected ScoreHolder createScoreHolder()
	{
		ScoreHolder total = new ScoreHolder("シンディー", 65, 69, 82);
		return total;
	}
	
}

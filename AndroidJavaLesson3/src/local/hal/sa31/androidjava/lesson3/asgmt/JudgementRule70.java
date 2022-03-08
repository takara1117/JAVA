package local.hal.sa31.androidjava.lesson3.asgmt;

public class JudgementRule70 implements JudgementRule
{
	@Override
	public boolean judge(int totalScore)
	{
		if (totalScore >= 210)
		{
			return true;
			}
			else {
			return false;
		}	
	}
	
}


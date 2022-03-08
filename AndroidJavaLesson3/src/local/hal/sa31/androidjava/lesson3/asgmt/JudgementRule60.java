package local.hal.sa31.androidjava.lesson3.asgmt;

public class JudgementRule60 implements JudgementRule
{
	@Override
	public boolean judge(int totalScore)
	{
		if (totalScore >= 180)
		{
			return true;
			}
			else {
			return false;
		}	
	}
}
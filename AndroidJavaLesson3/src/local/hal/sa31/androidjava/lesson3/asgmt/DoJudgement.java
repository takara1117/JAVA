package local.hal.sa31.androidjava.lesson3.asgmt;

public class DoJudgement
{
	public static void main(String[] args)
	{
		JudgementRule60 mikeScore = new JudgementRule60(); 
		JudgementRule70 cindyScore = new JudgementRule70();
		
		MikeJudgement  mike = new MikeJudgement(mikeScore);
		CindyJudgement cindy = new CindyJudgement(cindyScore);

		mike.judge();
		cindy.judge();
	}
	
}
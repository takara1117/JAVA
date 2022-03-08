package local.hal.sa31.androidjava.lesson1.asgmt;

public class BirthdayReminderKai {
	public static void main(String[] ards)
	{
		GirlFriend[] birthdayData =  {
			new GirlFriend("まゆみちゃん", 1998, 1, 5),
			new GirlFriend("まちこちゃん", 2003, 5, 15),
			new GirlFriend("まいちゃん", 1996, 5, 25),
			new GirlFriend("なみちゃん", 1999, 8, 3),
			new GirlFriend("えりちゃん", 2001, 11, 19),
			new GirlFriend("りえちゃん", 1997, 12, 23),
		};
	
		for (int month = 1; month <= 12; month++)
		{
			int cnt = 0;
			System.out.println("■■■■" + month + "月です。");
			for (GirlFriend girlFriend: birthdayData)
			{
				if (girlFriend.isBirthMonth(month))
		        {
					System.out.println(girlFriend.getName() + "が" + girlFriend.getBirthDay() + "日に誕生日です。" + girlFriend.getAge(2021) + "歳になります。メッセージを送りましょう!!");
					cnt++;
		        }
			}
			if (cnt == 0){
				System.out.println("誕生日を迎える女性はいません。安心してください");
		      }
		}
	}
}

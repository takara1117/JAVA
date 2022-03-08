package local.hal.sa31.androidjava.lesson4.asgmt;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class ShowItems 
{
	public static void main(String[] args) 
	{
		Map<Integer, Item> stock = new HashMap<>();

		Item article = new Item();
		article.setTitle("Linuxディストリビューション「Slackware 15.0」がリリース：CodeZine（コードジン）");
		article.setUrl("https://codezine.jp/article/detail/15547");
		article.setDesc("Linuxディストリビューションの1つであるSlackwareの開発チームは、最新版となる「Slackware 15.0」を2月2日（現地時間）にリリースした。");
		article.setPubDate(Timestamp.valueOf("2022-02-5 12:00:00"));
		article.setId(15547);
		stock.put(15547, article);

		Item article1 = new Item();
		article1.setTitle("マルチプラットフォームのアプリケーションUIフレームワーク「Flutter 2.10」がリリース：CodeZine（コードジン）");
		article1.setUrl("https://codezine.jp/article/detail/15549");
		article1.setDesc("米Googleは、オープンソースのマルチプラットフォーム・アプリケーションUIフレームワークFlutterの最新版となる、「Flutter 2.10」を2月4日（現地時間）にリリースした。");
		article1.setPubDate(Timestamp.valueOf("2022-02-7 08:00:00"));
		article1.setId(15549);
		stock.put(15549, article1);

		Item article2 = new Item();
		article2.setTitle("Microsoft、「Visual Studio Code」2022年1月リリース（バージョン1.64）をリリース：CodeZine（コードジン）");
		article2.setUrl("https://codezine.jp/article/detail/15548");
		article2.setDesc("米Microsoftは、コードエディタ「Visual Studio Code」の2022年1月リリース（バージョン1.64）をリリースしたことを、2月4日に発表した。");
		article2.setPubDate(Timestamp.valueOf("2022-02-07 09:00:00"));
		article2.setId(15548);
		stock.put(15548, article2);

		//表示
		System.out.println("--------- ヘッドライン --------- ");

		for (Map.Entry<Integer, Item> element : stock.entrySet()) 
		{
			Integer key = element.getKey();
			Item articles = element.getValue();

			StringBuffer contents = new StringBuffer();
			contents.append("--------- 記事ID:");
			contents.append(key);
			contents.append("\n■");
			contents.append(articles.getTitle());
			contents.append("\n[");
			contents.append(articles.getPubDate());
			contents.append("]\n");
			contents.append(articles.getDesc());
			contents.append("\n<" + articles.getUrl() + ">");

			System.out.println(contents.toString());
		}
	}
}

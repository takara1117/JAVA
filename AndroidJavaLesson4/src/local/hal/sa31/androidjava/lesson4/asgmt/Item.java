package local.hal.sa31.androidjava.lesson4.asgmt;

import java.sql.Timestamp;

public class Item
{
	
	private Integer _id;

	private String _title;

	private String _url;

	private String _desc;

	private Timestamp _pubDate;

	//以下アクセサメソッド

	public Integer getId() 
	{
		return _id;
	}

	public void setId(Integer id) 
	{
		_id = id;
	}

	public String getTitle() 
	{
		return _title;
	}

	public void setTitle(String title) 
	{
		_title = title;
	}

	public String getUrl() 
	{
		return _url;
	}

	public void setUrl(String url) 
	{
		_url = url;
	}

	public String getDesc() 
	{
		return _desc;
	}

	public void setDesc(String desc) 
	{
		_desc = desc;
	}

	public Timestamp getPubDate()
	{
		return _pubDate;
	}

	public void setPubDate(Timestamp pubDate)
	{
		_pubDate = pubDate;
	}
}


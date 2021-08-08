package com.thollil.annachi.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YoutubePlatform 
{
	public static void main(String []args)
	{
		String teluskoName = "telusko";
		String teluskoLogo = "https://yt3.ggpht.com/ytc/AKedOLQvY2hSrm6fs9KlScGc-z5kACXy0xodXGYmVuQJ=s176-c-k-c0x00ffffff-no-rj";
		Date teluskoJoinDate = new Date();
		String isTeluskoVerified = "true";
		Long teluskoViews =  (Long)Math.round(Math.pow(5, 6));
		String teluskoDescription = "Hey Aliens!!!\n"
				+ "I make free programming tutorials from beginner to advanced level\n"
				+ "That includes Java for beginner, Advanced Java, Python, Android, Blockchain, JavaScript, Kotlin, Scala, Spring Framework, Hibernate, C programming, Data Structures, Networking, REST API, and many more.\n"
				+ "Sometimes I make videos on motivation and take sessions with Tech industry experts.\n"
				+ "There is something for everyone here. \n";				
		String teluskoContactMail = "contact@telusko.com";
		
		List<String> teluskoUrl = new ArrayList<String>();
		teluskoUrl.add("https://courses.telusko.com/");
		teluskoUrl.add("https://www.instamojo.com/@NavinReddy/l3003b7d846f44975941113a88f0e6610/");
		teluskoUrl.add("https://www.facebook.com/teluskolearnings/");
		teluskoUrl.add("https://www.instagram.com/navinreddy20/?hl=en");
		
		YoutubeChannel telusko = new YoutubeChannel(teluskoName, teluskoLogo, isTeluskoVerified, teluskoJoinDate, teluskoViews, teluskoDescription, teluskoContactMail,teluskoUrl ,new ArrayList<YoutubeSubcriber>());		
		
		List<YoutubeChannel> channelList = new ArrayList<YoutubeChannel>();
		channelList.add(telusko);
		YoutubeSubcriber subscriber1 = new YoutubeSubcriber("navaneethan", "/usr/image1.png",new Date(),channelList);
		telusko.getSubscribers().add(subscriber1);
		
		telusko.upload("Observer Design Pattern in Java");
	}
}

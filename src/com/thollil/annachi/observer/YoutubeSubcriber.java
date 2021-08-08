package com.thollil.annachi.observer;

import java.util.Date;
import java.util.List;

public class YoutubeSubcriber 
{
	private String name;
	private String logo;
	private List<YoutubeChannel> channelList;
	private Date joinDate;
	
	/**
	 * @param name
	 * @param logo
	 * @param joinDate
	 */
	public YoutubeSubcriber(String name, String logo, Date joinDate,List<YoutubeChannel> channelList) 
	{	
		this.name = name;
		this.logo = logo;
		this.joinDate = joinDate;
		this.channelList = channelList;
	}
	public void notifyVideo(String notifyMessage)
	{
		System.out.println(notifyMessage);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public List<YoutubeChannel> getchannelList() {
		return channelList;
	}
	public void setchannelList(List<YoutubeChannel> channels) {
		this.channelList = channels;
	}
	
}

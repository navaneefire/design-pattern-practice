package com.thollil.annachi.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YoutubeChannel 
{
	private String name;
	private String logoPath;
	private String isVerified;
	private List<YoutubeSubcriber> subscribers = new ArrayList<>();
	private Date joinDate;
	private Long totalNoOfView;
	private String Description;
	private String contactMail;
	private List<String> url;
	
	
	

	/** create YoutubeChannel
	 * @param name
	 * @param logoPath
	 * @param isVerified
	 * @param joiningDate
	 * @param totalNoOfView
	 * @param description
	 * @param contactMail
	 * @param url
	 */
	public YoutubeChannel(String name, String logoPath, String isVerified, Date joinDate, Long totalNoOfView,
			String description, String contactMail, List<String> url,List<YoutubeSubcriber> subscribers) {		
		this.name = name;
		this.logoPath = logoPath;
		this.isVerified = isVerified;
		this.joinDate = joinDate;
		this.totalNoOfView = totalNoOfView;
		Description = description;
		this.contactMail = contactMail;
		this.url = url;
		this.subscribers = subscribers;
	}

	public void upload(String videoName)
	{
		for (YoutubeSubcriber a : this.subscribers)
		{
			a.notifyVideo("A new video \""+videoName+"\" uploaded by -"+this.name);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public String getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}

	

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Long getTotalNoOfView() {
		return totalNoOfView;
	}

	public void setTotalNoOfView(Long totalNoOfView) {
		this.totalNoOfView = totalNoOfView;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getContactMail() {
		return contactMail;
	}

	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
	}

	public List<String> getUrl() {
		return url;
	}

	public void setUrl(List<String> url) {
		this.url = url;
	}
	public List<YoutubeSubcriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<YoutubeSubcriber> subscribers) {
		this.subscribers = subscribers;
	}
	
}

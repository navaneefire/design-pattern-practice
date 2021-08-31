package com.thollil.annachi.strategy;

public class Dog extends Animal 
{
	private String sleepingTime;
	private Fly fly ;
	String barkSound = "WOWow WOWow";
	
	
	public Dog(String sleepingTime) 
	{
		this.sleepingTime = sleepingTime;
	}
	public Dog()
	{
		this.sleepingTime = "10:00PM to 06:00AM";
	}
	
	
	public String getSleepingTime() {
		return sleepingTime;
	}
	public void setSleepingTime(String sleepingTime) {
		this.sleepingTime = sleepingTime;
	}
	
	public Fly getFly() {
		return fly;
	}
	
	public void setFly(Fly fly) {
		this.fly = fly;
	}
	
	public void doBark()
	{
		System.out.println(barkSound);
	}
	
	public void tellMeAboutYourself()
	{
		System.out.println("I am dog");
		System.out.println(barkSound);
		fly.fly();
	}
	
}

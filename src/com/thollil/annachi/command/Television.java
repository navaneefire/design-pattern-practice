package com.thollil.annachi.command;

public class Television implements ElectronicDevice {

	int volume = 4;
	@Override
	public void off() 
	{
		System.out.println("Tv is now Off");
	}

	@Override
	public void on() 
	{
		System.out.println("Tv is now On");
	}

	@Override
	public void volumeUp() 
	{
		volume++;
		System.out.println("Tv volume increased to "+volume);
	}

	@Override
	public void volumeDown() 
	{
		volume--;
		System.out.println("Tv volume decreased to "+volume);

	}
	public static Television getTelevision()
	{
		return new Television();
	}

}

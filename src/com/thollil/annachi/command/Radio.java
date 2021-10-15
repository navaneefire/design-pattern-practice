package com.thollil.annachi.command;

public class Radio implements ElectronicDevice
{

	int volume = 4;
	@Override
	public void off() 
	{
		System.out.println("Radio is now Off");
	}

	@Override
	public void on() 
	{
		System.out.println("Radio is now On");
	}

	@Override
	public void volumeUp() 
	{
		volume++;
		System.out.println("Radio volume increased to "+volume);
	}

	@Override
	public void volumeDown() 
	{
		volume--;
		System.out.println("Radio volume decreased to "+volume);

	}
	public static Radio getRadio()
	{
		return new Radio();
	}

}

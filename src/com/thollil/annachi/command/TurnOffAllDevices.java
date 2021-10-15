package com.thollil.annachi.command;

import java.util.LinkedList;
import java.util.List;

public class TurnOffAllDevices implements Command
{
	List<ElectronicDevice> deviceList;

	
	public TurnOffAllDevices() 
	{		
		deviceList = new LinkedList<ElectronicDevice>();
	}


	@Override
	public void execute() 
	{
		for(ElectronicDevice elecDevice : deviceList)
		{
			elecDevice.on();
		}		
	}


	@Override
	public void undo() 
	{
		for(ElectronicDevice elecDevice : deviceList)
		{
			elecDevice.off();
		}	
	}
	
}

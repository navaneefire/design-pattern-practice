package com.thollil.annachi.command;

public class TurnOffDevice implements Command
{
	ElectronicDevice elecDevice;
	public TurnOffDevice(ElectronicDevice elecDevice) {
		super();
		this.elecDevice = elecDevice;
	}
	
	@Override
	public void execute()
	{
		elecDevice.off();
	}	
	
	@Override
	public void undo() 
	{
		elecDevice.off();
		
	}
}

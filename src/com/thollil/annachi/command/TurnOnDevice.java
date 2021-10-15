package com.thollil.annachi.command;

public class TurnOnDevice implements Command
{
	ElectronicDevice elecDevice ;
	
	public TurnOnDevice(ElectronicDevice elecDevice) {
		super();
		this.elecDevice = elecDevice;
	}
	public void execute()
	{
		elecDevice.on();
	}
	@Override
	public void undo() {
		elecDevice.off();
		
	}
	
	
}

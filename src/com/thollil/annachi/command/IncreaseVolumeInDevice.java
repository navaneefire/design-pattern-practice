package com.thollil.annachi.command;

public class IncreaseVolumeInDevice implements Command
{
	ElectronicDevice elecDevice;
	
	
	@Override
	public void execute() {
		
		elecDevice.volumeUp();
	}


	
	public IncreaseVolumeInDevice(ElectronicDevice elecDevice) {
		super();
		this.elecDevice = elecDevice;
	}



	@Override
	public void undo() {
		elecDevice.volumeDown();
		
	}
	
}

package com.thollil.annachi.command;

public class DeviceButton 
{
	public Command command;
	
	public void press()
	{
		command.execute();
	}
	public void undo()
	{
		command.undo();
	}

	/**
	 * @param command
	 */
	public DeviceButton(Command command) {
		super();
		this.command = command;
	}
}

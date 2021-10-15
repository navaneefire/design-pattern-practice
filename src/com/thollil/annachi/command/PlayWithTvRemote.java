package com.thollil.annachi.command;

public class PlayWithTvRemote 
{
	public static void main(String []args)
	{
			
		Television tv = Television.getTelevision();
		
		
		
		TurnOnDevice turnOnAction = new TurnOnDevice(tv);		
		DeviceButton button = new DeviceButton(turnOnAction);
		button.press();
		button.undo();
		button.press();
		
		TurnOffDevice turnOffAction = new TurnOffDevice(tv);
		DeviceButton button1 = new DeviceButton(turnOffAction);
		button1.press();
		button1.undo();
		
		
		IncreaseVolumeInDevice increaseVolumeAction = new IncreaseVolumeInDevice(tv);
		DeviceButton button2 = new DeviceButton(increaseVolumeAction);
		button2.press();
		button2.undo();
		
		
		Radio radio = Radio.getRadio();
		increaseVolumeAction = new IncreaseVolumeInDevice(radio);
		DeviceButton button3 = new DeviceButton(increaseVolumeAction);
		button3.press();
		button3.undo();
		
		TurnOffAllDevices allDeviceTurnOffAction = new TurnOffAllDevices();
		allDeviceTurnOffAction.deviceList.add(radio);
		allDeviceTurnOffAction.deviceList.add(tv);
		DeviceButton button4 = new DeviceButton(allDeviceTurnOffAction);
		button4.undo();
		
	}
}

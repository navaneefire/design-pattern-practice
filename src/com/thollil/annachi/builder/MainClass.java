package com.thollil.annachi.builder;

public class MainClass {

	public static void main(String[] args) {
		PhoneBuilder phBuilder = new PhoneBuilder();
		phBuilder.setName("Iphone 8+");
		phBuilder.setCompanyName("Applie");
		phBuilder.setProcessorFrequency(8);
		phBuilder.setRAMMemory(16);		
		phBuilder.setInternalMemory(256);
		phBuilder.setScreenSize(4);
		phBuilder.setBatteryCapacity(3000);
		phBuilder.setChargingTime(3);
		Phone ph = phBuilder.getPhone();
		System.out.print(ph);
	}

}

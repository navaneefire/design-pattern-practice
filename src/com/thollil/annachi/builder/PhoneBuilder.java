package com.thollil.annachi.builder;

public class PhoneBuilder 
{
	private String name;
	private String companyName;
	private long RAMMemory;
	private long internalMemory;
	private int processorFrequency;
	private int batteryCapacity;
	private int chargingTime;
	private int screenSize;
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}
	public PhoneBuilder setRAMMemory(long rAMMemory) {
		RAMMemory = rAMMemory;
		return this;
	}
	public PhoneBuilder setInternalMemory(long internalMemory) {
		this.internalMemory = internalMemory;
		return this;
	}
	public PhoneBuilder setProcessorFrequency(int processorFrequency) {
		this.processorFrequency = processorFrequency;
		return this;
	}
	public PhoneBuilder setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
		return this;
	}
	public PhoneBuilder setChargingTime(int chargingTime) {
		this.chargingTime = chargingTime;
		return this;
	}
	public PhoneBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public Phone getPhone()
	{
		return new Phone(name,companyName,RAMMemory,internalMemory,processorFrequency,batteryCapacity,chargingTime,screenSize);
	}
	
}

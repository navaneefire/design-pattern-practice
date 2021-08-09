package com.thollil.annachi.builder;

public class Phone 
{
	private String name;
	private String companyName;
	private long RAMMemory;
	private long internalMemory;
	private int processorFrequency;
	private int batteryCapacity;
	private int chargingTime;
	private int screenSize;
	
	
	
	/**
	 * @param name
	 * @param companyName
	 * @param rAMMemory
	 * @param internalMemory
	 * @param processorFrequency
	 * @param batteryCapacity
	 * @param chargingTime
	 * @param screenSize
	 */
	public Phone(String name, String companyName, long rAMMemory, long internalMemory, int processorFrequency,
			int batteryCapacity, int chargingTime, int screenSize) {
		super();
		this.name = name;
		this.companyName = companyName;
		RAMMemory = rAMMemory;
		this.internalMemory = internalMemory;
		this.processorFrequency = processorFrequency;
		this.batteryCapacity = batteryCapacity;
		this.chargingTime = chargingTime;
		this.screenSize = screenSize;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getRAMMemory() {
		return RAMMemory;
	}
	public void setRAMMemory(long rAMMemory) {
		RAMMemory = rAMMemory;
	}
	public long getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(long internalMemory) {
		this.internalMemory = internalMemory;
	}
	public int getProcessorFrequency() {
		return processorFrequency;
	}
	public void setProcessorFrequency(int processorFrequency) {
		this.processorFrequency = processorFrequency;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getChargingTime() {
		return chargingTime;
	}
	public void setChargingTime(int chargingTime) {
		this.chargingTime = chargingTime;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	
}

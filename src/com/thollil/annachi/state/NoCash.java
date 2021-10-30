package com.thollil.annachi.state;

public class NoCash implements ATMState
{
	ATMMachine atmMachine;
	
	
	
	public NoCash(ATMMachine atmMachine)
	{
		this.atmMachine = atmMachine;
	}
	
	
	@Override
	public void insertCard() 
	{
		System.out.println("We dont have  money");		
	}
	
	
	@Override
	public void ejectCard() 
	{
		System.out.println("We dont have  money");		
	}
	
	
	@Override
	public void insertPin(int pinEntered) 
	{
		System.out.println("We dont have  money");		
	}
	
	
	
	@Override
	public void requestCash(int cashToWithdraw) 
	{
		System.out.println("We dont have  money");
		
	}
}

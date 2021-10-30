package com.thollil.annachi.state;

public class NoCard implements ATMState {

	
	ATMMachine atmMachine;
	public NoCard(ATMMachine atmMachine)
	{
		this.atmMachine=atmMachine;
	}
	@Override
	public void insertCard() 
	{
		System.out.println("Please Enter PIN");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("no card inserted");
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("no card inserted");

	}

	@Override
	public void requestCash(int cashToWithdraw) 
	{		
		System.out.println("no card inserted");
	}

}

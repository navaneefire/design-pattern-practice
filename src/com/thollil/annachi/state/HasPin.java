package com.thollil.annachi.state;

public class HasPin implements ATMState
{
	
	ATMMachine atmMachine;

	public HasPin(ATMMachine atMMachine)
	{
		this.atmMachine =  atMMachine;
	}
	@Override
	public void insertCard() 
	{
		System.out.println("You have already inserted the card");
		
	}

	@Override
	public void ejectCard() 
	{
		System.out.println("Card ejected");		
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		
		System.out.println("You have already entered the pin");
	}

	@Override
	public void requestCash(int cashToWithdraw) 
	{
		if(atmMachine.getCashInMachine()>cashToWithdraw)
		{
			int balance = atmMachine.getCashInMachine() - cashToWithdraw;
			System.out.println("take the cash - amount = "+cashToWithdraw);
			atmMachine.setCashInMachine(balance);
			System.out.println("card ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		else
		{
			System.out.println("ATM has no enough cash");
			System.out.println("card ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
		
	}
	
}

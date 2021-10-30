package com.thollil.annachi.state;

public class HasCard implements ATMState {

	ATMMachine atmMachine;
	
	@Override
	public void insertCard() {
		System.out.println("You have already inserted card");

	}

	@Override
	public void ejectCard() {
		
		System.out.println("card ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) 
	{
		if(pinEntered == 5643)
		{
			System.out.println("Correct PIN");
			atmMachine.setCorrectPinEntered(true);
			atmMachine.setATMState(atmMachine.getHasPin());
		}
		else
		{
			System.out.println("InCorrect PIN");
			atmMachine.setCorrectPinEntered(false);
			System.out.println("card ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}

	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub

	}

	
	public HasCard(ATMMachine atmMachine) {		
		this.atmMachine = atmMachine;
	}

}

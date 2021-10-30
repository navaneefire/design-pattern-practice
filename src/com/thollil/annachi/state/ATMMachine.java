package com.thollil.annachi.state;

public class ATMMachine 
{
	ATMState hasCard;
	ATMState noCard;
	ATMState hasPin;
	ATMState atmOutOfMoney;
	ATMState atmState;
	
	int cashInMachine;
	boolean correctPinEntered = false;
	public boolean isCorrectPinEntered() {
		return correctPinEntered;
	}
	public void setCorrectPinEntered(boolean correctPinEntered) {
		this.correctPinEntered = correctPinEntered;
	}
	public ATMMachine() 
	{
		hasCard = new HasCard(this);
		noCard =  new NoCard(this);
		hasPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		atmState=noCard;
		
		if(cashInMachine>0)
		{
			atmState = atmOutOfMoney;
		}
		
	}
	void setATMState(ATMState atmState)
	{
		this.atmState= atmState;
	}
	void setCashInMachine(int cashInMachine)
	{
		this.cashInMachine=  cashInMachine;
	}
	
	
	public int getCashInMachine() {
		return cashInMachine;
	}
	public void insertCard()
	{
		atmState.insertCard();
	}
	public void ejectCard()
	{
		atmState.ejectCard();
	}
	public void insertPin(int pinEntered)
	{
		atmState.insertPin(pinEntered);
	}
	void requestCash(int cashRequired)
	{
		atmState.requestCash(cashRequired);
	}
	ATMState getYesCardState()
	{
		return hasCard;
	}
	ATMState getNoCardState()
	{
		return noCard;
	}
	ATMState getHasPin()
	{
		return hasPin;
	}
	ATMState getNoCash()
	{
		return atmOutOfMoney;
	}
}

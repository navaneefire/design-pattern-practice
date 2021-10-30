package com.thollil.annachi.state;

public class TestATMMachine 
{
	public static void main(String ...args)
	{
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.setCashInMachine(10000000);
		
		atmMachine.requestCash(20000);
		
		atmMachine.insertPin(2345);
		
		atmMachine.requestCash(20000);
		
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(2345);
		
		atmMachine.requestCash(20000);
		
		atmMachine.requestCash(20000);
	}
}

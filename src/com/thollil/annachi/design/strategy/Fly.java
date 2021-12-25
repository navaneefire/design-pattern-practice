package com.thollil.annachi.design.strategy;

public interface Fly 
{
	public String fly();
}

class CanFly implements Fly
{
	@Override
	public String fly()
	{
		return "i can fly";
	}
}
class CantFly implements Fly
{
	@Override
	public String fly() 
	{
		return "i cant fly";
	}
}
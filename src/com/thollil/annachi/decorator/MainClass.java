package com.thollil.annachi.decorator;

public class MainClass 
{
	public static void main(String []args)
	{
			
		Pizza mainPizza = new TomatoTopping(new PerperOnionTopping(new MozarellaTopping(new PlainPizza())));
		System.out.println("ingredient of pizza = " +mainPizza.getDescription());
		System.out.println("cost of pizza"+mainPizza.getCost());
	}
}

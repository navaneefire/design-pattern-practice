package com.thollil.annachi.strategytwo;

public class TestStrategy 
{
	public static void main(String []args)
	{
		IFly flyBehaviour = new CantFly();
		ISwim swimBehaviour = new CanSwim();
		IWalk walkBehaviour = new CanWalk();
		Animal lizard = new Animal(flyBehaviour,swimBehaviour,walkBehaviour);		
		System.out.println(lizard.tellMeAboutYourSelf());


		flyBehaviour = new CanFly();
		swimBehaviour = new CantSwim();
		walkBehaviour = new CantWalk();
		Animal butterFly = new Animal(flyBehaviour,swimBehaviour,walkBehaviour);		
		System.out.println(butterFly.tellMeAboutYourSelf());
		
		
		
		
		flyBehaviour = new CantFly();
		swimBehaviour = new CanSwim();
		walkBehaviour = new CanWalk();
		Animal snake = new Animal(flyBehaviour,swimBehaviour,walkBehaviour);		
		System.out.println(snake.tellMeAboutYourSelf());
	}
}

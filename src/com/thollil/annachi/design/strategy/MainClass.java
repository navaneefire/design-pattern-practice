package com.thollil.annachi.design.strategy;

import java.util.Objects;

public class MainClass 
{
	public static void main(String []args)
	{
		Animal doggy = new Dog();
		doggy.setFly(new CantFly());
		Animal parrot = new Bird();
		parrot.setFly(new CanFly());
		
		System.out.println("Dog says " +Objects.requireNonNull(doggy.getFly()).fly());
		System.out.println("parrot says "+Objects.requireNonNull(parrot.getFly()).fly());
		doggy.setFly(new CanFly());
		System.out.println("Dog says " +Objects.requireNonNull(doggy.getFly()).fly());
	}
}

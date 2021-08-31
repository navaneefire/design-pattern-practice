package com.thollil.annachi.strategy;

public class MainClass 
{
	public static void main(String []args)
	{
		Dog dog = new Dog();
		Fly fly = new DogFly();
		dog.setFly(fly);
		dog.tellMeAboutYourself();
		fly  = new DogWithFeaturesFly();
		dog.setFly(fly);
		dog.tellMeAboutYourself();
	}
}

package com.thollil.annachi.decorator;

import java.util.List;

public abstract class PizzaTopping implements Pizza
{
	Pizza pizza;
	public PizzaTopping(Pizza pizza)
	{
		this.pizza = pizza;
	}
	public abstract List<String >getDescription();
	public abstract Double getCost();
}

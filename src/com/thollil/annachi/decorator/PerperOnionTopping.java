package com.thollil.annachi.decorator;

import java.util.ArrayList;
import java.util.List;

public class PerperOnionTopping extends PizzaTopping 
{
	
	public PerperOnionTopping(Pizza pizza)
	{
		super(pizza);		
	}
	@Override
	public List<String> getDescription() 
	{
		List<String> ingredients = new ArrayList<String>(pizza.getDescription());
		ingredients.add("peperonion");
		return ingredients;
	}

	@Override
	public Double getCost() 
	{
		return pizza.getCost()+5;
		
	}

}

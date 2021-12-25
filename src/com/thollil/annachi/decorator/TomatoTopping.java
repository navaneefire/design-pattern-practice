package com.thollil.annachi.decorator;

import java.util.ArrayList;
import java.util.List;

public class TomatoTopping extends PizzaTopping {

	public TomatoTopping(Pizza pizza)
	{
		super(pizza);
	}
	@Override
	public List<String> getDescription() 
	{		
		
		List<String> ingredients = new ArrayList<String>(pizza.getDescription());
		ingredients.add("tomato sauce");
		return ingredients;
	}

	@Override
	public Double getCost() 
	{		
		return pizza.getCost()+3;
	}

}

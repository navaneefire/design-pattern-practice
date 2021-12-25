package com.thollil.annachi.decorator;

import java.util.ArrayList;
import java.util.List;

public class PlainPizza implements Pizza {

	List<String> description ;
	Double cost;
	public PlainPizza()
	{
		description = new ArrayList<String>();
		description.add("Plain dough");
		cost=10d;
	}
	@Override
	public List<String> getDescription() 
	{				
		return description;
	}

	@Override
	public Double getCost() 
	{		
		return cost;
	}

}

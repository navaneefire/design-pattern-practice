package com.thollil.annachi.strategytwo;

public class Animal 
{
	IFly fly;
	ISwim swim;
	IWalk walk;
	
	
	
	public IFly getFly() {
		return fly;
	}



	public void setFly(IFly fly) {
		this.fly = fly;
	}



	public ISwim getSwim() {
		return swim;
	}



	public void setSwim(ISwim swim) {
		this.swim = swim;
	}



	public IWalk getWalk() {
		return walk;
	}



	public void setWalk(IWalk walk) {
		this.walk = walk;
	}



	String tellMeAboutYourSelf()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(fly.fly()+"\n");
		sb.append(swim.swim()+"\n");
		sb.append(walk.walk()+"\n");
		sb.append("\n\n\n\n");
		return sb.toString();
	}



	/**
	 * @param fly
	 * @param swim
	 * @param walk
	 */
	public Animal(IFly fly, ISwim swim, IWalk walk) {
		super();
		this.fly = fly;
		this.swim = swim;
		this.walk = walk;
	}
}

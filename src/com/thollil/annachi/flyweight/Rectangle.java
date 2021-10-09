package com.thollil.annachi.flyweight;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Rectangle 
{
	public Color color = Color.BLACK;
	public int x,x1,y,y1;
	Rectangle(Color color)
	{
		this.color=color;
		x=getRandomNumber();
		x1=getRandomNumber();
		y=getRandomNumber();
		y1=getRandomNumber();
		
	}
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillRect(x, y, x1, y1);
	}
	static int getRandomNumber()
	{
		Random rand = new Random();
		return rand.nextInt(1000);
	}
}

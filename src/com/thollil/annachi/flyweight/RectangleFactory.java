package com.thollil.annachi.flyweight;

import java.awt.Color;
import java.util.HashMap;

public class RectangleFactory 
{
	final static HashMap<Color,Rectangle> colorVsRectangleMap= new HashMap<Color,Rectangle>();
	public static Rectangle getRectangle(Color color)
	{
		
		Rectangle rect = colorVsRectangleMap.get(color);
		if(rect == null)
		{
			rect = new Rectangle(color);
			colorVsRectangleMap.put(color, rect);			 
		}
		return rect;
	}
}

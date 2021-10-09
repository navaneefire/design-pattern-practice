package com.thollil.annachi.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlyWeightFrame  extends JFrame
{
    JButton drawing;
    int windowHeight =12789;
    int windowWidth=123896;
    static Color[] colors = new Color[] {Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan, Color.magenta,
            Color.black, Color.gray};

    public FlyWeightFrame() 
    {
    	this.setSize(windowWidth,windowHeight);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("Flyweight Test");

    	JPanel mainPanel = new JPanel();    	
    	mainPanel.setLayout(new BorderLayout());
    	JButton startButton = new JButton("Drawing board");
    	mainPanel.add(startButton,BorderLayout.NORTH);
    	JPanel drawingBoard = new JPanel();
    	mainPanel.add(drawingBoard,BorderLayout.CENTER);
    	startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Random rand = new Random();
				Graphics g = drawingBoard.getGraphics();
				for(int i=0;i<10000;i++)
				{
					Color color = FlyWeightFrame.colors[rand.nextInt(9)];
					Rectangle rect =RectangleFactory.getRectangle(color);
					rect.draw(g);
				}
				
			}
		});
    	this.add(mainPanel);
    	this.setVisible(true);
	}
    public static void main(String []args)
    {
    	new FlyWeightFrame();
    }
}

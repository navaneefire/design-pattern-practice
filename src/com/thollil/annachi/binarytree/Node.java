package com.thollil.annachi.binarytree;

import java.util.ArrayDeque;


public class Node 
{
	public int value;
	public Node leftNode;
	public Node rightNode;
	
	public static void getOutput(Node node)
	{
		ArrayDeque<Node> nodeQueue = new ArrayDeque<Node>();
		nodeQueue.add(node);		
		int level=1;
		int queueLength=1;
		while(nodeQueue.size()>0)
		{	
			System.out.print("level"+level+ "=======> ");			
			for(int i=0;i<queueLength;i++)
			{
				Node currentNode  = nodeQueue.poll();
				System.out.print(currentNode.value);
				if(currentNode.leftNode!=null)
				{
					nodeQueue.offer(currentNode.leftNode);					
				}				
				if(currentNode.rightNode!=null)
				{	
					nodeQueue.offer(currentNode.rightNode);					
				}				
				System.out.print("   ");
			}
			System.out.println();
			queueLength = nodeQueue.size();
			level++;
		}
	}
}

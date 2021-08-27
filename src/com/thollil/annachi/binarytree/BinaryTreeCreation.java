package com.thollil.annachi.binarytree;

public class BinaryTreeCreation 
{
	public static Node createBinaryTree(int startIndex,int endIndex)
	{
		if(startIndex > endIndex)
		{
			return null;
		}
		else if(startIndex == endIndex)
		{
			Node node = new Node();
			int mid = (startIndex+endIndex)/2;
			node.value=mid;
			node.leftNode=null;
			node.rightNode=null;
			return node;
		}
		else
		{
			Node node =new Node();
			int mid = (startIndex+endIndex)/2;
			Node leftNode = createBinaryTree(startIndex, mid-1);
			Node rightNode = createBinaryTree(mid+1,endIndex);
			node.value=mid;
			node.leftNode=leftNode;
			node.rightNode=rightNode;
			return node;
		}
		
	}
	public static void main(String []args)
	{
		Node node  = createBinaryTree(1,41);
		System.out.println("tree created successfully");
		Node.getOutput(node);
	}
}

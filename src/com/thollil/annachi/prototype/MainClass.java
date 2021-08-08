package com.thollil.annachi.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainClass 
{
	public static void main(String []args) throws CloneNotSupportedException
	{
		List<BillItem> billItemList =new ArrayList<BillItem>();
		String[] itemNames = new String[]{"Rice RS50 5KG","IDLY RICE 5KG","Guru Citron 300G","Surf XL bar 250G","Short Chilli 100G"};
		for(int i=0;i<5;i++)
		{
			int amount = (int) Math.round(Math.random()*100);
			int quantity = (int)Math.round(Math.random()*100);
			int MRPRate  = quantity * amount;
			BillItem bItem = new BillItem(itemNames[i%5],quantity,MRPRate,amount);
			billItemList.add(bItem);
		}
		RationShopBill rationShopBill = new RationShopBill(58473858l,"Mudichur",785646l,"Cash",new Date(),billItemList);		
		RationShopBill rationShopBill2 = rationShopBill.clone();
		billItemList.remove(4);
		System.out.println(rationShopBill);
		System.out.println(rationShopBill2);
	}
}

package com.thollil.annachi.prototype;

public class BillItem 
{
	private String productName;
	private int quantity;
	private int MRPRate;
	private int amount;
	
	public BillItem(String productName,int quantity,int MRPRate , int amount)
	{
		this.productName=productName;
		this.amount=amount;
		this.quantity=quantity;
		this.MRPRate=MRPRate;
	}
	public String toString()
	{
		return "productName - "+this.productName+
				"|| amount - "+ this.amount + 
				"|| quantity - " + this.quantity+
				"|| MRPRate -"+this.MRPRate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getMRPRate() {
		return MRPRate;
	}
	public void setMRPRate(int mRPRate) {
		MRPRate = mRPRate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}


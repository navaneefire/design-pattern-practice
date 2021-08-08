package com.thollil.annachi.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RationShopBill implements Cloneable 
{
	private Long billNumber;
	private String rationShopAddress;
	private Long customerNumber;
	private String billingType;
	private Date billingTime;
	private List<BillItem> billItemList;
	public Long getBillNumber() {
		return billNumber;
	}
	public String toString()
	{
		StringBuilder result  = new StringBuilder("billNumber - "+this.billNumber+
				"rationShopAddress - "+this.rationShopAddress+
				"customerNumber - "+this.customerNumber+
				"billingType - "+this.billingType+
				"billingTime - "+this.billingTime);
		result.append("ItemList");
		for(BillItem item : billItemList)
		{
			result.append("\n"+item.toString());
		}	
		result.append("\n\n\n");
		return result.toString();
	}
	public RationShopBill(Long billNumber, String rationShopAddress, Long customerNumber, String billingType,
			Date billingTime, List<BillItem> billItemList) {
		super();
		this.billNumber = billNumber;
		this.rationShopAddress = rationShopAddress;
		this.customerNumber = customerNumber;
		this.billingType = billingType;
		this.billingTime = billingTime;
		this.billItemList = billItemList;
	}
	
	public RationShopBill clone() throws CloneNotSupportedException
	{
		RationShopBill rationShopBill = (RationShopBill)super.clone();
		rationShopBill.setItems(new ArrayList<BillItem>(this.getItems()));
		return rationShopBill;
	}
	public void setBillNumber(Long billNumber) {
		this.billNumber = billNumber;
	}
	public String getRationShopAddress() {
		return rationShopAddress;
	}
	public void setRationShopAddress(String rationShopAddress) {
		this.rationShopAddress = rationShopAddress;
	}
	public Long getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getBillingType() {
		return billingType;
	}
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}
	public Date getBillingTime() {
		return billingTime;
	}
	public void setBillingTime(Date billingTime) {
		this.billingTime = billingTime;
	}
	public List<BillItem> getItems() {
		return billItemList;
	}
	public void setItems(List<BillItem> items) {
		this.billItemList = items;
	}
	
}

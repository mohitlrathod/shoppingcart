package com.shopping;

public class RegularCustomer implements Customer {

	@Override
	public double calculateDiscount(long totalBill) {
	
		if(5000 >= totalBill)
		{
			return 0;
		}
		else if(5000 < totalBill && totalBill<= 10000)
		{
			double dis =  ((totalBill - 5000) * 0.1);
			return totalBill - dis;
		}		
		else
		{	double dis = 500+ ((totalBill - 10000) * 0.2);
			return totalBill - dis;
		}
	}

}

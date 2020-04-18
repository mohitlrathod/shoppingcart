package com.shopping;

public class PremiumCustomer implements Customer {

	@Override
	public double calculateDiscount(long totalBill) {
		if(totalBill<= 4000)
		{
			return totalBill - ( totalBill * 0.1);
		}
		else if(4000 < totalBill && totalBill<= 8000)
		{
			double dis = 400 + ((totalBill - 4000) * 0.15);
			return totalBill - dis;
		}		
		else if(8000 < totalBill && totalBill< 12000)
		{
			double dis = 400 + 600 + ((totalBill - 8000) * 0.2);
			return totalBill - dis;
		}
		else
		{	double dis = 1800+ ((totalBill - 12000) * 0.3);
			return totalBill - dis;
		}
	}

}

package com.shopping;

public class Main {
	public static void main(String[] args) {
		
	//	Customer premium = new PremiumCustomer();
		
		Customer premium  = CustomerFactory.buildCar("Premium");
		
		System.out.println(premium.calculateDiscount(8000));
	}
}

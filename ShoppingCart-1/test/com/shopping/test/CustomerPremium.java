package com.shopping.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.Customer;
import com.shopping.CustomerFactory;
import com.shopping.ShoppingConstant;

public class CustomerPremium {

	

	@Test
	public void TestPremiumCustomer_20000() {
		Customer premium = CustomerFactory.buildCar(ShoppingConstant.PREMIUM);
	    assertEquals("Premium customer test",15800.0, premium.calculateDiscount(20000), 0);
	}

	@Test
	public void TestPremiumCustomer_12000() {
		Customer premium = CustomerFactory.buildCar(ShoppingConstant.PREMIUM);
	    assertEquals("Premium customer test",10200.0, premium.calculateDiscount(12000), 0);
	}
	
	@Test
	public void TestPremiumCustomer_8000() {
		Customer premium = CustomerFactory.buildCar(ShoppingConstant.PREMIUM);
	    assertEquals("Premium customer test",7000.0, premium.calculateDiscount(8000), 0);
	}
	
	@Test
	public void TestPremiumCustomer_4000() {
		Customer premium = CustomerFactory.buildCar(ShoppingConstant.PREMIUM);
	    assertEquals("Premium customer test",3600, premium.calculateDiscount(4000), 0);
	}
}

package com.shopping.test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.shopping.Customer;
import com.shopping.CustomerFactory;
import com.shopping.ShoppingConstant;

public class CustomerRegular {


	Customer regular;
	
	 @Before
	    public void init() {
		 regular =  CustomerFactory.buildCar(ShoppingConstant.REGULAR);
	    }
	 
	
	@Test
	public void TesRegularCustomer_5000() {
		
	    assertEquals("Regular customer test",0.0, regular.calculateDiscount(5000), 0);
	}

	@Test
	public void TestRegularCustomer_10000() {
	    assertEquals("Regular customer test",9500.0, regular.calculateDiscount(10000), 0);
	}
	
	@Test
	public void TestRegularCustomer_15000() {
	    assertEquals("Regular customer test",13500.0, regular.calculateDiscount(15000), 0);
	}
	
}

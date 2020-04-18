package com.shopping;
public class CustomerFactory {
    public static Customer buildCar(String type) {
    	Customer customer = null;
        switch (type) {
        case ShoppingConstant.PREMIUM:
        	customer = new PremiumCustomer();
            break;
        case ShoppingConstant.REGULAR:
        	customer = new RegularCustomer();
            break;
        default:
            // throw some exception
            break;
        }
        return customer;
    }
}
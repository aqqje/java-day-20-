package day14.java;

import bank.com.Customer;

public class TestCustomerDAO {
	public static void main(String[] args) {
		CustomerDAO c = new CustomerDAO();
		c.add(new Customer(null, null));
		c.get(0);
	}
}

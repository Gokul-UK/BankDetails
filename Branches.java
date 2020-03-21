package autoBoxingUnBoxing;

import java.util.ArrayList;

public class Branches {
	private String name;
	private ArrayList<Customer> myCustomer;
	
	public Branches(String name) {
		this.name = name;
		this.myCustomer = new ArrayList<Customer>();
	}
	
	public String getName() {
		return name;	
	}
	
	public ArrayList<Customer> getCustomers(){
		return myCustomer;
	}

	public boolean addNewCustomer(String name, double initialAmount) {
		if(findCustomer(name) == null) {
			this.myCustomer.add(new Customer(name, initialAmount));
			return true;
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String name, double amount) {
		Customer existingCustomer = findCustomer(name);
		if(existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		
		return false;
	}
	
	public Customer findCustomer(String name) {
		for(int i = 0; i < this.myCustomer.size(); i++) {
			Customer customer = this.myCustomer.get(i);
			if(customer.getName().equals(name)) {
				return customer;
			}
		}
		return null;
	}
	
}

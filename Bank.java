package autoBoxingUnBoxing;

import java.util.ArrayList;

public class Bank {
	@SuppressWarnings("unused")
	private String name;
	private ArrayList<Branches> bankBranches;
	
	public Bank(String name) {
		this.name = name;
		this.bankBranches = new ArrayList<Branches>();
	}
	
	public boolean addBranch(String branchName) {
		if(findBranch(branchName) == null) {
			this.bankBranches.add(new Branches(branchName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String branchName, String customerName, double initialAmount) {
		Branches branch = findBranch(branchName);
		if(branch != null) {
			return branch.addNewCustomer(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branches branch = findBranch(branchName);
		if(branch != null) {
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}
	
	public Branches findBranch(String branchName) {
		for(int i = 0; i < this.bankBranches.size(); i++) {
			Branches checkedBranch = this.bankBranches.get(i);
			if(checkedBranch.getName().equals(branchName)) {
				return checkedBranch;
			}
		}
		return null;
	}
	
	public boolean listCustomers(String branchName, boolean showTransaction) {
		Branches branch = findBranch(branchName);
		if(branch != null) {
			System.out.println("Customer details for " + branch.getName());
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for(int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer " + branchCustomer.getName() + "[" + (i+1) + "]");
				
				if(showTransaction) {
					System.out.println("Transaction");
					ArrayList <Double> transaction = branchCustomer.getTransaction();
					for(int j = 0; j < transaction.size(); j++) {
						System.out.println("[" + (j+1) + "]" + transaction.get(j));
					}
				}
			}
			return true;
		} else return false;
	}
	
}
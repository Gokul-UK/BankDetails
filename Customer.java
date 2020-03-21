package autoBoxingUnBoxing;

import java.util.ArrayList;

public class Customer {
//    private String name;
//    private ArrayList<Double> transactions;
//
//    public Customer(String name, double initialAmount) {  // Below code is simple form of commented declaration
//        this.name = name;	
//        this.transactions = new ArrayList<Double>();
//        addTransaction(initialAmount);
//    }
	private String name;
	private ArrayList<Double> transaction = new ArrayList<Double>();  //Simple form of declaration

	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transaction.add(initialAmount);
	}
	
	public void addTransaction(double amount) {
		this.transaction.add(amount);
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Double> getTransaction(){
		return transaction;
	}
}

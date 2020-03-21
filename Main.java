package autoBoxingUnBoxing;

import java.util.Scanner;
public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static Bank bank = new Bank("HDFC");
	
	public static void main(String[] args) {
		boolean quit = true;
		int action = 0;
		
		printActions();
		
		while(quit) {
			action = scan.nextInt();
			scan.nextLine();
			
			switch(action) {
			
			case 0:
				System.out.println("Shutting down......");
				quit = false;
				break;
			case 1:
				addBranch();
				break;
			case 2:
				addNewCustomer();
				break;
			case 3:
				updateTransaction();
				break;
			case 4:
				listCustomer();
				break;
			case 5:
				printActions();
				break;
			}
		}
	}
	
	private static void addBranch() {
		System.out.println("Enter the Branch name");
		String branchName = scan.nextLine();
		if(bank.addBranch(branchName)) {
			System.out.println("Branch has been added");
		}
	}
	
	private static void addNewCustomer() {
		System.out.println("Enter the Exixting Branch, NewCustomer name, Initial amount");
		String branch = scan.nextLine();
		String name = scan.nextLine();
		double amount = scan.nextInt();
		if(bank.addCustomer(branch, name, amount)) {
			System.out.println("Ok Man");
		}
		else System.out.println("Sorry Man");
	}
	
	private static void updateTransaction() {
		System.out.println("Enter the Exixting Branch, Existing Customer name, New transaction amount\"");
		String branch = scan.nextLine();
		String name = scan.nextLine();
		double amount = scan.nextInt();
		if(bank.addCustomerTransaction(branch, name, amount))
			System.out.println("Ok Man");
		else System.out.println("Sorry Man");
	}
	
	private static void listCustomer() {
		System.out.println("Enter the Brance name");
		String branchName = scan.nextLine();
		bank.listCustomers(branchName, true);
	}
	
	private static void printActions() {
		System.out.println("Please enter the options you want to perform");
		System.out.println("\n 0 - to Shutdown" +
				           "\n 1 - to Add a Branch" +
				           "\n 2 - to Add a New customer" +
				           "\n 3 - to Update a transaction" +
				           "\n 4 - to print the list of customers" +
				           "\n 5 - to show the options to perform");
		System.out.println("Please cheese your action");
		
	}
	
}

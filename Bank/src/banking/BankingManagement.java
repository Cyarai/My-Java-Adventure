package banking;

public class BankingManagement {
	
	private double accountBalance;
	
	public BankingManagement(double balance) {
		this.accountBalance = balance;
	}
	
	public double getBalance() {
		return this.accountBalance;
	}
	
	//Deposit
	public void deposit(double amount) {
		if(amount > 0) {
			
			this.accountBalance = accountBalance + amount;
			System.out.println("Your are Succesfully deposite " + amount + " on this account.");
			
		}
		
		else {
			System.out.println("Invalid amount");
		}
		
	
	}
	//Withdraw
	public void withdraw(double amount) {
		if(amount > 0 && amount <= this.accountBalance){
			
			this.accountBalance = accountBalance - amount;
			System.out.println("You are succesfully withdraw " + amount + " on this account.");
		}
		else if (amount > this.accountBalance) {
			System.out.println("Insufficient funds.");
		}
		else {
			System.out.println("Invalid withdrawal amount try again.");
		}
	}

}

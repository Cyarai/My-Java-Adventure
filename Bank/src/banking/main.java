package banking;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		
		BankingManagement banking = new BankingManagement(1000.00);
		
		System.out.print("Enter your Name: ");
		String input = scanner.nextLine().toUpperCase();
		
		boolean isRunning = true;
		
		while(isRunning) {
			
			System.out.println("\n ******* Welcome to "+ input + " Bank Account *******");
			System.out.println(" ");
			System.out.println("****** Choose one in the choices in Menu ****** ");
			System.out.println(" ");
			System.out.print(" 1. See Account Balance: ");
			System.out.print("\n 2. Deposite to Account: ");
			System.out.print("\n 3. Withdraw to Account: ");
			System.out.print("\n 4. Exit");
			System.out.print("\n Enter # you choose: ");
			
			
			
		
		int choice = scanner.nextInt();
		
		switch(choice) {
			case 1 : 
				System.out.print("This is your account Balance: " + banking.getBalance());
				System.out.print("\n ");
				break;
			
			case 2: 
				System.out.print("Enter the amount you want to Deposit: ");
				System.out.print(" ");
				double depositeAmount = scanner.nextDouble();
				banking.deposit(depositeAmount);
				break;
				
			case 3: 
				System.out.print("Enter the amount you want to Withdraw: ");
				System.out.print(" ");
				double withdrawAmount = scanner.nextDouble();
				banking.withdraw(withdrawAmount);
				break;
				
			case 4: 
				isRunning = false;
				break;
				
			default:
				System.out.println("Invalid choice. Please try again.");
		}
		
		
	}
		System.out.println("Thank you for using the bank. Have a Great day and Goodbye!");
		scanner.close();
	}
	
	
}

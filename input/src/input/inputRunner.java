package input;

import java.util.Scanner;

public class inputRunner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number1:");
		int number1 = scanner.nextInt();
		System.out.println("The number you enter is - " + number1);
		
		System.out.println("Enter Number2:");
		int number2 = scanner.nextInt();
		
		System.out.println("The number you enter is - " + number2);
		
		System.out.println("Availble Choices");
		System.out.println("1 - add");
		System.out.println("2 - subtract");
		System.out.println("3 - multiply");
		System.out.println("4 - divide");
		
		
		System.out.println("Enter Choice:");
		int choice = scanner.nextInt();
		
		System.out.println("Your Choice are");
		System.out.println("Number1 " + number1);
		System.out.println("Number2 " + number2);
		System.out.println("Choice " + choice);
		
		extracted(number1, number2, choice);
		
		}
	
	
	private static void extracted(int number1, int number2, int choice) {
		if(choice == 1) {
			System.out.println("The Value of Number1 and Number2 is - " + (number1 + number2));
			}else if(choice == 2) {
				System.out.println("The Value of Number1 and Number2 is - " + (number1 - number2));
			}else if(choice == 3) {
				System.out.println("The Value of Number1 and Number2 is - " + (number1 * number2));
			}else if(choice == 4) {
				System.out.println("The Value of Number1 and Number2 is - " + (number1 / number2));
			}else {
				System.out.println("That is not in the choices");
			}
	}
	

	private static void extractedSwitch(int number1, int number2, int choice) {
		
		switch(choice) {
		case 1 : System.out.println("The Value of Number1 and Number2 is - " + (number1 + number2));
		break;
		case 2 : System.out.println("The Value of Number1 and Number2 is - " + (number1 - number2));
		break;
		case 3: System.out.println("The Value of Number1 and Number2 is - " + (number1 * number2));
		break;
		case 4: System.out.println("The Value of Number1 and Number2 is - " + (number1 / number2));
		break;
		default: System.out.println("That is not in the choices");
		break;
		}
		

		
	}

}

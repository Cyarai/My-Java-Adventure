package Todolist;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		TaskManager t = new TaskManager();
		int choice;
		
		do {
			System.out.println("\n ----------- TO DO LIST ----------- \n");
			System.out.println("1. Add Task");
			System.out.println("2. View Task");
			System.out.println("3. Mark Task As Done");
			System.out.println("4. Remove Task");
			System.out.println("5. Exit");
			System.out.print("\nEnter # of your choice: ");
			
			
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1 : 
				System.out.print("Enter new task: ");
				String desc = scanner.nextLine();
				t.addTask(desc);
				break;
				
			case 2: 
				t.showTask();
				break;
				
			case 3: 
				t.showTask();
				System.out.print("Enter task number to mark as done: ");
				int doneIndex = scanner.nextInt();
				t.markDone(doneIndex);
				break;
				
			case 4: 
				t.showTask();
				System.out.print("Enter the number you want to delete in task list: ");
				int deleteIndex = scanner.nextInt();
				t.deleteTask(deleteIndex);
				break;
				
			case 5:
                System.out.println("Goodbye!");
                break;
                
			default:
                System.out.println("Invalid choice!");
			}
			
		}while(choice != 5);

	}

}

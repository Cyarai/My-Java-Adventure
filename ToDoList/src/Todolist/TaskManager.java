package Todolist;

import java.util.ArrayList;

public class TaskManager {
	private ArrayList<Todolist> Task = new ArrayList<>();
	
	public void addTask(String description) {
		Task.add(new Todolist(description));
	}
	
	public void showTask () {
		if(Task.isEmpty()) {
			System.out.println("Empty no task found");
			
		}else {
			for(int i = 0; i < Task.size(); i++) {
			System.out.println((i + 1) + ". " + Task.get(i));
			}
		}
	}
	
	public void markDone(int index) {
		if(index > 0 && index <= Task.size()) {
			Task.get(index - 1).markDone();
			System.out.println("Task marked as done!");
		}else {
			System.out.println("Invalid task number choose again");
		}
		
	}
	
	public void deleteTask(int index) {
		if(index > 0 && index <= Task.size()) {
			Task.remove(index - 1);
			System.out.println("Task Delete");
			
		}else {
			System.out.println("Invalid number choose again");
		}
	}
	
}

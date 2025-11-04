package Todolist;

public class Todolist {
	
	private String description;
	private boolean isDone;
	
	
	public Todolist(String description) {
		
		this.description = description;
		this.isDone = false;
		
	}
	
	public String getDescription() {
		return description;
	}
	
	public Boolean isDone() {
		return isDone;
	}
	
	public void markDone() {
		isDone = true;
	}
	
	@Override
	
	public String toString() {
		return (isDone ?  "[✓] " : "[ ] ") + description;
	}

	
	

}

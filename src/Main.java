import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

// this is Task class 
 class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }
}
// this is todolist class 
class ToDoList {
    private List<Task> tasks;
    public ToDoList() {
        tasks = new ArrayList<>();
    }
    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markAsCompleted();
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void displayTasks() {
        System.out.println("To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getDescription() + " - " + (task.isCompleted() ? "Completed" : "Not Completed"));
        }
    }
}
// This is Main Class....
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("\n(1) Add Task \n(2) Mark Task as Completed \n(3) Display Tasks \n(4) Exit");
            System.out.print("Enter Your Choice: ");
            int choice = ob.nextInt(); 
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description); // To add the task
                    break; 
                case 2:
                    System.out.print("Enter task index to mark as completed: ");
                    int index = scanner.nextInt();
                    toDoList.markTaskAsCompleted(index - 1); // To mark the completed task
                    break;
                case 3:
                    toDoList.displayTasks(); // To display the task 
                    break; 
                case 4:
                    System.out.println("Exiting program."); // To exit the program
                    System.exit(0); 
                default:
                    System.out.println("Invalid choice. Please try again."); // if invalid  
            }
        }
    }
}


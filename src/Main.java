import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
// this is task class which task we want to do...
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
// This is Second class...
class ToDoList {
    private List<Task> tasks;
    public ToDoList() {
        tasks = new ArrayList<>();
    }
 // This is Add task method
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
// This is display method
    public void displayTasks() {
        System.out.println("To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getDescription() + " - " + (task.isCompleted() ? "Completed" : "Not Completed"));
        }
    }
}
// This is Main Class
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. Mark Task as Completed\n3. Display Tasks\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to mark as completed: ");
                    int index = scanner.nextInt();
                    toDoList.markTaskAsCompleted(index - 1);
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.\n Please try again.");
            }
        }
    }
}
//                                            THE END

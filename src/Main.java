
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
                    System.out.println("Invalid choice. Please try again."); // if invalid key is pressed. 
            }
        }
    }
}



// This is Main Class
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task \n2. Mark Task as Completed \n3. Display Tasks \n4. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = ob.nextInt();
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
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
//                                            THE END

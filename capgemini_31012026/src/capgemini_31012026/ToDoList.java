package capgemini_31012026;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    // Task class (each task is an object)
    static class Task {
        private String taskName;
        private boolean isCompleted;

        // Constructor
        public Task(String taskName) {
            this.taskName = taskName;
            this.isCompleted = false; // initially not completed
        }

        // Getter
        public String getTaskName() {
            return taskName;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        // Mark task completed
        public void completeTask() {
            isCompleted = true;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dynamic list to store tasks
        ArrayList<Task> tasks = new ArrayList<>();

        System.out.println("To-Do List Application");
        System.out.println("======================");

        while (true) {

            // Menu
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                // Add Task
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();

                    Task newTask = new Task(name);
                    tasks.add(newTask);

                    System.out.println("Task Added Successfully!");
                    break;

                // View Tasks
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {

                            Task t = tasks.get(i);

                            String status = (t.isCompleted()) ? "Completed" : "Pending";

                            System.out.println((i + 1) + ". " + t.getTaskName()
                                    + " [" + status + "]");
                        }
                    }
                    break;

                // Complete Task
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to complete.");
                        break;
                    }

                    System.out.print("Enter task number to complete: ");
                    int completeIndex = scanner.nextInt();

                    if (completeIndex > 0 && completeIndex <= tasks.size()) {
                        tasks.get(completeIndex - 1).completeTask();
                        System.out.println("Task Marked as Completed!");
                    } else {
                        System.out.println("Invalid Task Number!");
                    }
                    break;

                // Remove Task
                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                        break;
                    }

                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt();

                    if (removeIndex > 0 && removeIndex <= tasks.size()) {
                        tasks.remove(removeIndex - 1);
                        System.out.println("Task Removed Successfully!");
                    } else {
                        System.out.println("Invalid Task Number!");
                    }
                    break;

                // Exit
                case 5:
                    System.out.println("Exiting To-Do List App. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

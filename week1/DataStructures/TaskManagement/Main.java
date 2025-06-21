public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask(new Task("T101", "Fix Bug", "Pending"));
        taskList.addTask(new Task("T102", "Write Docs", "In Progress"));
        taskList.addTask(new Task("T103", "Review PR", "Pending"));

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for T102:");
        Task t = taskList.searchTask("T102");
        System.out.println(t != null ? t : "Not Found");

        System.out.println("\nDeleting T102...");
        taskList.deleteTask("T102");

        System.out.println("\nTasks After Deletion:");
        taskList.traverseTasks();
    }
}

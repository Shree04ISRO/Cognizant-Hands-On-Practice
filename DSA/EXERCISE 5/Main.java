public class Main {

    public static void main(String[] args) {

        TaskLinkedList tasks =
                new TaskLinkedList();

        tasks.addTask(
                new Task(
                        101,
                        "Coding",
                        "Pending"));

        tasks.addTask(
                new Task(
                        102,
                        "Testing",
                        "Completed"));

        tasks.addTask(
                new Task(
                        103,
                        "Documentation",
                        "Pending"));

        System.out.println(
                "\nAll Tasks:");

        tasks.displayTasks();

        System.out.println(
                "\nSearch Task:");

        tasks.searchTask(102);

        System.out.println(
                "\nDelete Task:");

        tasks.deleteTask(102);

        System.out.println(
                "\nAfter Deletion:");

        tasks.displayTasks();
    }
}
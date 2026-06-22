public class TaskLinkedList {

    Node head;

    void addTask(Task task) {

        Node newNode =
                new Node(task);

        if(head == null) {

            head = newNode;
        }
        else {

            Node temp = head;

            while(temp.next != null) {

                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println(
                "Task Added");
    }

    void displayTasks() {

        Node temp = head;

        while(temp != null) {

            System.out.println(
                    temp.task);

            temp = temp.next;
        }
    }

    void searchTask(int taskId) {

        Node temp = head;

        while(temp != null) {

            if(temp.task.taskId
                    == taskId) {

                System.out.println(
                        temp.task);

                return;
            }

            temp = temp.next;
        }

        System.out.println(
                "Task Not Found");
    }

    void deleteTask(int taskId) {

        if(head == null)
            return;

        if(head.task.taskId
                == taskId) {

            head = head.next;

            System.out.println(
                    "Task Deleted");

            return;
        }

        Node temp = head;

        while(temp.next != null &&
              temp.next.task.taskId
                      != taskId) {

            temp = temp.next;
        }

        if(temp.next != null) {

            temp.next =
                    temp.next.next;

            System.out.println(
                    "Task Deleted");
        }
    }
}
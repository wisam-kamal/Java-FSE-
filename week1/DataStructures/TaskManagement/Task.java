class Task {
    private String taskId;
    private String taskName;
    private String status;

    public Task(String taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public String toString() {
        return "Task ID: " + taskId + ", Name: " + taskName + ", Status: " + status;
    }
}

class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

class TaskList {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void traverseTasks() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.task);
            curr = curr.next;
        }
    }

    public Task searchTask(String taskId) {
        Node curr = head;
        while (curr != null) {
            if (curr.task.getTaskId().equals(taskId)) {
                return curr.task;
            }
            curr = curr.next;
        }
        return null;
    }

    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            if (curr.next.task.getTaskId().equals(taskId)) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}

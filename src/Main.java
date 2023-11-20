import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.addTask(new Task("test", "2000-01-01", "test.test"));
        list.addTask(new Task("test2", "2000-01-02", "test.test"));
        list.addTask(new Task("test3", "2000-01-02", "test2.test2"));
        list.addTask(new Task("test7", "2000-02-01", "test2.test2"));
        list.addTask(new Task("test5", "2000-01-08", "test.test"));
        list.addTask(new Task("test6", "2000-01-09", "test2.test2"));
        list.addTask(new Task("test4", "2000-01-05", "test.test"));

        System.out.println("To-Do List:");
        for (Task task : list.getAllTasks()) {
            System.out.println("- " + task.toString());
        }

        List<Task> testList = list.getByAuthor("test.test");
        System.out.println("To-Do by author List:");
        for (Task task : testList) {
            System.out.println("- " + task.toString());
        }

        testList = list.getByDate("2000-01-02");
        System.out.println("To-Do by date List:");
        for (Task task : testList) {
            System.out.println("- " + task.toString());
        }
    }
}
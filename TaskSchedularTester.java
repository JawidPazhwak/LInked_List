public class TaskSchedularTester {
    public static void main(String[] args) {
        Task t1 = new Task("Shopping", 1);
        Task t2 = new Task("Eating", 2);
        Task t3 = new Task("Meeting", 3);
        TaskScheduler task = new TaskScheduler();
        task.addTask(t1);
        task.addTask(t3);
        task.addTask(t2);
        task.executeTask();
        task.showTasks();
    }
}

public class Task {
    public String name;
    public int id;
    public int priority;
    public static int totalTasks;
    public Task nextTask;

    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
        totalTasks ++;
        id = totalTasks;
    }
    public void showDetails(){
        System.out.println("Name: " + name + "\n" + "ID: " + id + "\n" + "Priority: " + priority);
    }
}

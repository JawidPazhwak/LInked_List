public class TaskScheduler {
    public Task firstTask;
    
    public void addTask(Task t){
        System.out.println("====Adding Tasks====");
        if(firstTask == null){
            firstTask = t;
            System.out.println(t.name + " added");
        }
        else{
            Task current = firstTask;
            while(current.nextTask != null){
                current = current.nextTask;
            }
            current.nextTask = t;
            System.out.println(t.name + " added");
        }
    }
    public void executeTask(){
        System.out.println("====Executing Tasks====");
        Task current = firstTask;
        if(firstTask == null){
            System.out.println("No tasks to execute");
            return;
        }
        while(current.nextTask != null){
            if(current.priority <= current.nextTask.priority){
                System.out.println("Executing " + current.name + "\nPriority: " + current.priority);
            }
            current = current.nextTask;
        }
        if(current.nextTask == null){
            System.out.println("Executing " + current.name + "\nPriority: " + current.priority);
        }
    }
    public void showTasks(){
        System.out.println("====Showing Tasks====");
        if(firstTask == null){
            System.out.println("No tasks");
        }
        else{
            Task current = firstTask;
            while(current != null){
                current.showDetails();
                System.out.println();
                current = current.nextTask;
            }
        }
    }
}

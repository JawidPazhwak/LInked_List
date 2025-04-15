public class StudentRegistry {
    public Student head;

    public void addStudent(Student s){
        if(head == null){
            head = s;
        }
        else{
            Student current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = s;
            System.out.println(s.name + " added");
        }
    }
    public void showStudents(){
        if(head == null){
            System.out.println("No student");
        }
        else{
            Student current = head;
            while(current != null){
                current.details();
                current = current.next;
            }
        }
    }
}

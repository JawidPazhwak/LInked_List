public class Student {
    public String name;
    public String department;
    public int id;
    public Student next;
    public static int generate_id;
    public Student(String name, String department){
        this.name = name;
        this.department = department;
        id = generate_id ++;
        next = null;
    }
    public void details(){
        System.out.println("Name: " + name + "\n" + "ID: " + id + "\n" + "Department: " + department);
    }

}

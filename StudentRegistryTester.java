public class StudentRegistryTester {
    public static void main(String[] args) {
        StudentRegistry r = new StudentRegistry();
        Student s1 = new Student("Bob", "EEE");
        Student s2 = new Student("Alice", "CSE");
        Student s3 = new Student("A", "BIL");
        r.head = s1;
        r.addStudent(s2);
        r.addStudent(s3);
        r.showStudents();

    }
}

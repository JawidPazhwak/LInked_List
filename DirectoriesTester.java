public class DirectoriesTester {
    public static void main(String[] args) {
        Files f1 = new Files("Photo1", 10);
        Files f2 = new Files("Photo2", 10);
        Files f3 = new Files("Videos", 10);
        Directories d1 = new Directories("Photos");
        Directories d2 = new Directories("Videos");
        d1.first_file = f1;
        d1.addFile(f2);
        d2.addFile(f3);
        d1.showDetails();
        d1.addDirectory(d2);
        d1.showDetails(d2);
    }
    

}

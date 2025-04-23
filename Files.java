public class Files {
    public String name;
    public int size;
    public Files next_file;
    private static int totalFiles; 

    public Files(String name, int size){
        this.name = name;
        this.size = size;
        totalFiles ++;
        next_file = null;
    }
    public void show_totalFiles(){
        System.out.println(totalFiles);
    }
    public void showDetails(){
        System.out.println("Name: " + name + "\n" + "Size: " + size + "MB");
    }
}

public class Directories {
    public String name;
    public Files first_file;
    public Directories first_directory;
    public Directories next_directory;

    public Directories(String name){
        this.name = name;
        System.out.println(name + " directory created");
        next_directory = null;
    }
    public void addFile(Files f){
        if(this.first_file == null){
            this.first_file = f;
        }
        else{
            Files current = this.first_file;
            while(current.next_file != null){
                current = current.next_file;
            }
        current.next_file = f;
        System.out.println("File added to " + name);
    }
}
    public void showDetails(){
        Files current = first_file;
        while(current != null){
            current.showDetails();
            current = current.next_file;
        }
    }
    public void addDirectory(Directories d){
        if(first_directory == null){
            first_directory = d;
        }
        else{
            Directories current = first_directory;
            while(current.next_directory != null){
                current = current.next_directory;
            }
            current.next_directory = d;
            System.out.println(d.name + " added to the main " + name + " directory");
        }
    }
    public void showDetails(Directories d){
        if(first_directory == null){
            System.out.println(d.name + " directory is empty");
        }
        else{
            Directories currentDirectory = first_directory;
            if(currentDirectory.first_file == null){
                System.out.println(currentDirectory.name + " directory is empty");
            }
            else{
                while(currentDirectory != null){
                    if(currentDirectory.name.equals(d.name)){
                        currentDirectory.showDetails();
                    }
                    currentDirectory = currentDirectory.next_directory;
                }
            }
           
        }
    }
}

public class Song {
    public String name;
    public String artist;
    public int length;
    public static int totalSongs;
    public Song nextSong;
    public Song prevSong;
    public boolean played = false;

    public Song(String name, String artist, int length){
        this.name = name;
        this.artist = artist;
        this.length = length;
        nextSong = null;
        totalSongs ++;
        System.out.println(name + " created by " + artist);
    }
    public void showDetails(){
        System.out.println("Title: " + name + "\n" + "Artist: " + artist + "\n" + "Duration: " + length);
    }
}

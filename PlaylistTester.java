public class PlaylistTester {
    public static void main(String[] args) {
        Song s1 = new Song("A", "A", 3);
        Song s2 = new Song("B", "B", 3);
        Song s3 = new Song("C", "C", 3);
        Playlist p1 = new Playlist("Playlist1");
        p1.addSong(s1);
        p1.addSong(s2);
        p1.addSong(s3);
        p1.showPlaylist();
        p1.deleteSong(s3);
        p1.showPlaylist();
        p1.playNext(s3);
        p1.playNext(s1);
        p1.playPrevious(s3);
        p1.songsPlayed();

    }

}

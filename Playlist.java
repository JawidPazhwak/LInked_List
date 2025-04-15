public class Playlist {
    public String name;
    public Song firstSong;
    

    public Playlist(String name){
        this.name = name;
        System.out.println(name + " created");
    }
    public void addSong(Song s){
        if(firstSong == null){
            firstSong = s;
            firstSong.prevSong = null;
            System.out.println(s.name + " by " + s.artist + " added to the playlist " + name);
        }
        else{
            Song current = firstSong;
            while(current.nextSong != null){
                current = current.nextSong;
            }
            current.nextSong = s;
            s.prevSong = current;
            System.out.println(s.name + " by " + s.artist + " added to the playlist " + name);   
        }
    }
    public void showPlaylist(){
        if(firstSong == null){
            System.out.println(name + " is empty");
        }
        else{
            Song current = firstSong;
            while(current != null){
                current.showDetails();
                current = current.nextSong;
            }
            // if(current == null){
            //     System.out.println(name + " is empty");
            // }   
        }
    }
    public void deleteSong(Song s){
        if(firstSong == null){
            System.out.println("Could not find " + s.name);
        }
        else{
            if(firstSong.equals(s)){
                firstSong = firstSong.nextSong;
                System.out.println(s.name + " deleted from " + name);
            }
            else{
                Song current = firstSong;
                while(current.nextSong != null && ! current.nextSong.equals(s)){
                    current = current.nextSong;
                }
                if(current.nextSong == null){
                    System.out.println("Could not find " + s.name);
                }
                current.nextSong = current.nextSong.nextSong;
                System.out.println(s.name + " deleted from " + name);
            }
        }
    }
    public void playNext(Song s){
        Song current = firstSong;
        if(s == null){
            System.out.println("Could not find " + s.name);
        }
        else{
            if(current.equals(s)){
                System.out.println(current.name + " by " + current.artist + " is playling");
                current.played = true;
            }
            else{
                while(current != null && !current.equals(s)){
                    current = current.nextSong;
                }
                if(current == null){
                    System.out.println("Could not find " + s.name);
                    return;
                }
                else{
                    System.out.println(current.name + " by " + current.artist + " is playling");
                    current.played = true;
                }

            }
            
        }
    }
    public void playPrevious(Song s){
        if(s.prevSong == null){
            System.out.println("There is nor previous song");
        }
         else{     
            System.out.println(s.prevSong.name + " by " + s.prevSong.artist + " is playling");
            s.prevSong.played = true;
        }
    }
    public void songsPlayed(){
        Song current = firstSong;
        boolean playedSong = false;
        while(current != null){
            if(current.played){
                System.out.println(current.name + " played");
                playedSong = true;
            }
            current = current.nextSong;
        }
        if(!playedSong){
            System.out.println("No songs");
        }
    }
}

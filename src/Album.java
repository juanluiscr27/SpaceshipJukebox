import java.util.*;

public class Album {
    private String[] titles;
    private final Map<String, Song> songs;

    public Album(Song... songs) {
        this.songs = new HashMap<>();
        for (Song song: songs) {
            this.songs.put(song.getTitle(), song);
        }
        this.titles = new String[this.songs.size()];
        this.titles = this.songs.keySet().toArray(this.titles);
    }

    public String[] getTitles() {
        return titles;
    }

    public Song getSongs(String title) {
        return songs.get(title);
    }
}

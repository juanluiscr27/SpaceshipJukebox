import java.util.*;

public class Album {
    private final String name;
    private String[] titles;
    private final Map<String, Song> songs;
    public Album(String name, Song ... songs) {
        this.name = name;
        this.songs = new HashMap<>();
        for (Song song: songs) {
            this.songs.put(song.getTitle(), song);
        }
        this.titles = new String[this.songs.size()];
        this.titles = this.songs.keySet().toArray(this.titles);
    }

    @Override
    public String toString() {
        return "Album("+ this.name + ")";
    }

    public String getName() {
        return name;
    }
    public String[] getTitles() {
        return titles;
    }
    public Song getSong(String title) {
        return songs.get(title);
    }
}

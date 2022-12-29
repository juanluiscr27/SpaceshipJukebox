import java.util.*;

public class Library {
    private final String[] titles;
    private final Map<String, Album> albums;
    public Library(Album ... albums) {
        this.albums = new HashMap<>();
        for (Album album : albums) {
            this.albums.put(album.getName(), album);
        }
        this.titles = this.albums.keySet().toArray(new String[0]);
    }

    public String[] getTitles() {
        return titles;
    }
    public Album getAlbum(String title) {
        return albums.get(title);
    }
}

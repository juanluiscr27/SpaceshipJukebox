public class Library {
    private String[] titles;
    private final Album[] albums;
    public Library(Album[] albums) {
        this.albums = albums;
        // TODO: Generate a list of title base on the albums
    }

    public String[] getTitles() {
        return titles;
    }

    public Album getAlbum() {
        // TODO: Select album based on the title
        return albums[0];
    }
}

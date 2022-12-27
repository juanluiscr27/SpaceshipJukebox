public class Album {
    private String[] titles;
    private Song[] songs;

    public Album(Song[] songs) {
        this.songs = songs;
        // TODO: Generate the titles list based on the songs
    }

    public String[] getTitles() {
        return titles;
    }

    public Song getSongs() {
        // TODO: Select a song using the title
        return songs[0];
    }
}

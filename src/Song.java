public class Song {
    private final String title;
    private final String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song(" + title + " - " + artist +")";
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void play() {
        System.out.println("The song " + title + " from " + artist + " is now playing...");
    }
}

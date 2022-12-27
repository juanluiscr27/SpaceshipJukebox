public class Queue {
    private Song[] playlist;

    public void addSong(Song song, User user) {
        // TODO: Add song functionality
        playlist[playlist.length] = song;
    }

    public Song getNextSong() {
        // TODO: Get next song functionality
        return playlist[0];
    }

    public void removeSong() {
        // TODO: Remove song functionality
    }
}

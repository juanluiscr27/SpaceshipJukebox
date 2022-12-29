public class Main {
    public static void main(String[] args) {
        System.out.println("* Spaceship Jukebox *");
        Song s1 = new Song("Easy on Me", "Adele");
        Song s2 = new Song("Cry Your Heart Out", "Adele");
        Song s3 = new Song("Strangers by Nature", "Adele");
        Album a1 = new Album("30", s1, s2, s3);

        Song s4 = new Song("Blinding Lights", "The Weeknd");
        Song s5 = new Song("Save Your Tears", "The Weeknd");
        Song s6 = new Song("After Hours", "The Weeknd");
        Album a2 = new Album("After Hours", s4, s5, s6);

        String[] titles = a1.getTitles();
        System.out.println("Album: " + a1.getName());
        for (String title : titles) {
            System.out.println(" * " + a1.getSong(title));
        }
    }
}
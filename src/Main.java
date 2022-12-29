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

        Library library = new Library(a1, a2);

        String[] a1Titles = a1.getTitles();
        System.out.println(a1);
        for (String title : a1Titles) {
            System.out.println(" * " + a1.getSong(title));
        }

        String[] a2Titles = a2.getTitles();
        System.out.println(a2);
        for (String title : a2Titles) {
            System.out.println(" * " + a2.getSong(title));
        }

        System.out.println("Library: ");
        for (String title : library.getTitles()) {
            System.out.println(" * " + title);
        }
    }
}
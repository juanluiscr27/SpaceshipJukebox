public class Main {
    public static void main(String[] args) {
        System.out.println("* Spaceship Jukebox *");
        Song s1 = new Song("Easy on Me", "Adele");
        Song s2 = new Song("Cry Your Heart Out", "Adele");
        Song s3 = new Song("Strangers by Nature", "Adele");
        Album a1 = new Album(s1, s2, s3);
        System.out.println(a1.getSong(s1.getTitle()));
    }
}
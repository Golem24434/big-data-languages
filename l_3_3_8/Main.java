public class Main {
    public static void main(String[] args) {
        Piano fata = new Piano();
        fata.keys = new Key[3];

        fata.keys[0] = new Key("PUM!");
        fata.keys[1] = new Key("PAM!");
        fata.keys[2] = new Key("POM!");

        fata.play();
    }
}
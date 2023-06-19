public class Main {
    public static void main(String[] args) {
        Fotografia foto1 = new Fotografia();
        foto1.setNazvanie("Пейзаж");

        Fotografia foto2 = new Fotografia();
        foto2.setNazvanie("Портрет");

        Fotoalbum album = new Fotoalbum();
        album.addFoto(foto1);
        album.addFoto(foto2);

        System.out.println(album.getCount()); // выводит 2
    }
}
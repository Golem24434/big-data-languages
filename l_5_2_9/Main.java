public class Main {
    public static void main(String[] args) {
        Furniture furniture = new BookCloset(3);
        furniture.display();
        ((Closet) furniture).addShelf();
    }
}
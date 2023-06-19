public class BookCloset extends Closet {
    public BookCloset(int shelves) {
        super(shelves);
    }

    @Override
    public void addShelf() {
        shelves++;
        System.out.println("Added a shelf. Now the closet has " + shelves + " shelves.");
    }
}
public abstract class Closet implements Furniture {
    protected int shelves;

    public Closet(int shelves) {
        this.shelves = shelves;
    }

    @Override
    public void display() {
        System.out.println("This is a closet with " + shelves + " shelves.");
    }

    public abstract void addShelf();
}
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();

        park.addAttraction("Rollercoaster", "10:00 - 18:00", 20);
        park.addAttraction("Ferris wheel", "11:00 - 21:00", 15);
        park.addAttraction("Bumper cars", "12:00 - 22:00", 10);
        park.addAttraction("Carousel", "10:30 - 20:30", 5);
        park.addAttraction("Haunted house", "14:00 - 23:00", 25);
        park.addAttraction("Water slide", "10:00 - 19:00", 18);
        park.addAttraction("Merry-go-round", "11:30 - 21:30", 7);
        park.addAttraction("Space shuttle", "13:00 - 22:00", 30);
        park.addAttraction("Tea cups", "10:30 - 20:30", 6);
        park.addAttraction("Zoo train", "11:00 - 18:00", 12);

        List<Park.Attraction> attractions = park.getAttractions();
        for (Park.Attraction attraction : attractions) {
            System.out.println(attraction.getName() + " is open " + attraction.getTime() + " and costs " + attraction.getCost() + " dollars");
        }
    }
}
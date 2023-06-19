import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addMovie("The Dark Knight", "123 Main St", "7:00 PM");
        cinema.addMovie("The Godfather", "456 Oak Ave", "8:30 PM");
        cinema.addMovie("Pulp Fiction", "789 Elm St", "9:15 PM");

        List<Cinema.Movie> movies = cinema.getMovies();
        for (Cinema.Movie movie : movies) {
            System.out.println("Playing " + movie.getName() + " at " + movie.getAddress() + " at " + movie.getTime());
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies;

    public Cinema() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(String name, String address, String time) {
        Movie movie = new Movie(name, address, time);
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public class Movie {
        private String name;
        private String address;
        private String time;

        public Movie(String name, String address, String time) {
            this.name = name;
            this.address = address;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getTime() {
            return time;
        }
    }
}
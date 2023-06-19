import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String time, int cost) {
        Attraction attraction = new Attraction(name, time, cost);
        attractions.add(attraction);
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public class Attraction {
        private String name;
        private String time;
        private int cost;

        public Attraction(String name, String time, int cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public int getCost() {
            return cost;
        }
    }
}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[10];
        trains[0] = new Train("Москва", 123, "10:00", 50, 20, 100, 5);
        trains[1] = new Train("Санкт-Петербург", 456, "11:30", 80, 35, 150, 10);
        trains[2] = new Train("Казань", 789, "13:15", 60, 25, 120, 8);
        trains[3] = new Train("Владивосток", 321, "14:45", 70, 30, 130, 7);
        trains[4] = new Train("Екатеринбург", 654, "17:00", 55, 22, 110, 6);
        trains[5] = new Train("Ростов-на-Дону", 987, "19:15", 75, 28, 140, 9);
        trains[6] = new Train("Нижний Новгород", 246, "21:30", 65, 26, 125, 7);
        trains[7] = new Train("Красноярск", 135, "22:45", 40, 18, 90, 3);
        trains[8] = new Train("Пермь", 864, "23:30", 45, 20, 100, 4);
        trains[9] = new Train("Самара", 975, "01:00", 85, 40, 160, 12);

        System.out.println("Список поездов, следующих до Москвы:");
        for(Train train : trains) {
            if(train.getDestination().equals("Москва")) {
                System.out.println(train.toString());
            }
        }

        System.out.println("Список поездов, следующих до Казани и отправляющихся после 13:00:");
        for(Train train : trains) {
            if(train.getDestination().equals("Казань") && train.getDepartureTime().compareTo("13:00") > 0) {
                System.out.println(train.toString());
            }
        }

        System.out.println("Список поездов, отправляющихся до Екатеринбурга и имеющих общие места:");
        for(Train train : trains) {
            if(train.getDestination().equals("Екатеринбург") && train.getCommonSeats() > 0) {
                System.out.println(train.toString());
            }
        }
    }
}
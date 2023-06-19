public class Train {
    private String destination; // Пункт назначения
    private int trainNumber; // Номер поезда
    private String departureTime; // Время отправления
    private int commonSeats; // Число общих мест
    private int coupeSeats; // Число купе мест
    private int reservedSeats; // Число плацкартных мест
    private int deluxeSeats; // Число люкс мест

    // Конструкторы
    public Train(String dest, int num, String depTime, int commSeats, int cpSeats, int resSeats, int dlxSeats) {
        this.destination = dest;
        this.trainNumber = num;
        this.departureTime = depTime;
        this.commonSeats = commSeats;
        this.coupeSeats = cpSeats;
        this.reservedSeats = resSeats;
        this.deluxeSeats = dlxSeats;
    }

    public Train() {
        this("", 0, "", 0, 0, 0, 0);
    }

    // Методы get/set
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCommonSeats() {
        return commonSeats;
    }

    public void setCommonSeats(int commonSeats) {
        this.commonSeats = commonSeats;
    }

    public int getCoupeSeats() {
        return coupeSeats;
    }

    public void setCoupeSeats(int coupeSeats) {
        this.coupeSeats = coupeSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public int getDeluxeSeats() {
        return deluxeSeats;
    }

    public void setDeluxeSeats(int deluxeSeats) {
        this.deluxeSeats = deluxeSeats;
    }

    // Метод toString
    public String toString() {
        return "Train to " + this.destination
                + ", train number " + this.trainNumber
                + ", departs at " + this.departureTime
                + ", common seats: " + this.commonSeats
                + ", coupe seats: " + this.coupeSeats
                + ", reserved seats: " + this.reservedSeats
                + ", deluxe seats: " + this.deluxeSeats;
    }
}
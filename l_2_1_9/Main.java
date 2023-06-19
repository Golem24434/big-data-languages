import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение k: ");
        int k = scanner.nextInt();

        switch (k) {
            case 0:
                System.out.println(k + " принадлежит интервалу (-10k, 0]");
                break;
            case 5:
                System.out.println(k + " принадлежит интервалу (0, 5]");
                break;
            case 10:
                System.out.println(k + " принадлежит интервалу (5, 10]");
                break;
            default:
                if (k < 0) {
                    System.out.println(k + " принадлежит интервалу (-10k, 0]");
                } else if (k > 0 && k < 5) {
                    System.out.println(k + " принадлежит интервалу (0, 5]");
                } else if (k > 5 && k < 10) {
                    System.out.println(k + " принадлежит интервалу (5, 10]");
                } else {
                    System.out.println(k + " принадлежит интервалу (10, 10k]");
                }
                break;
        }
        String developer = "Yunusov";
        Date dateOfGettingTask = new Date(2023 - 1900, Calendar.FEBRUARY, 17, 15, 40);
        Date dateOfPassingTask = new Date(2023 - 1900, Calendar.MAY, 26, 15, 40);
        System.out.println("Developer: " + developer);
        System.out.println("Task got: "+ dateOfGettingTask);
        System.out.println("Task passed: " + dateOfPassingTask);
    }
}
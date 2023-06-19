public class Main {
    public static void main(String[] args) {
        int[] positions = {10, 15, 20, 25}; // позиции
        int[] speeds = {2, 3, 5, 4}; // скорости
        int count = 0;

        for (int i = 0; i < positions.length; i++) {
            for (int j = i + 1; j < positions.length; j++) {
                // если один автомобиль догоняет другой сзади
                if (positions[i] < positions[j] && speeds[i] > speeds[j]) {
                    count++;
                } else if (positions[j] < positions[i] && speeds[j] > speeds[i]) {
                    count++;
                }
            }
        }
        System.out.println("Количество обгонов: " + count);
    }
}
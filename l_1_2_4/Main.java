public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
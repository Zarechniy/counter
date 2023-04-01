import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");

        int n = scanner.nextInt();
        int summ = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                summ += i;
            }
        }

        System.out.println("Ответ: " + summ);
    }
}

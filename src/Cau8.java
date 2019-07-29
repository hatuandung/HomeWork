import java.util.Scanner;

public class Cau8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + (1.0 * (2 * i + 1)) / (2 * i + 2);
        }

        System.out.println(sum);
    }
}

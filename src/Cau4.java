import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / (2 * i);
        }

        System.out.println(sum);
    }
}

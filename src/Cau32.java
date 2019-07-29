import java.util.Scanner;

public class Cau32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

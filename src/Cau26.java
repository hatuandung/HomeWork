import java.util.Scanner;

public class Cau26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        for (int i = 1; i < n ; i++) {
            if (i % 2 == 1) System.out.println(i);
        }
    }
}

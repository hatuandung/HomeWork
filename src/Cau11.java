import java.util.Scanner;

public class Cau11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum  = 0;

        for (int i = 1; i <= n; i++) {
            int mul = 1;
            for (int j = 1; j <= i; j++) {
                mul = mul *  j;
            }
            sum = sum + mul;
        }

        System.out.println(sum);

    }
}

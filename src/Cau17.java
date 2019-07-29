import java.util.Scanner;

public class Cau17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                mul = mul * i;
            }
        }

        System.out.println("sum: " + sum);
        System.out.println("mul: " + mul);
    }

}

import java.util.Scanner;

public class Cau18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int countChan = 0;
        int countLe = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (n % i == 0 && i % 2 == 0) {
                countChan++;
            } else if (n % i == 0 && i % 2 != 0) {
                countLe++;
            }
        }

        System.out.println("count: " + count);
        System.out.println("countChan: " + countChan);
        System.out.println("countLe: " + countLe);
    }
}

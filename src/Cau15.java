import java.util.Scanner;

public class Cau15 {
    public static void main(String[] args) {
        int giaiThua = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ( n == 0|| n == 1)   giaiThua = 1;
        else {
            for (int i = 2; i <= n ; i++) {
                giaiThua = giaiThua * i;
            }
        }
        System.out.println(giaiThua);
    }
}

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Cau28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        for (int i = 1; i<= h; i++){
            for (int j = 1; j <= h - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i - 1 ; k++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}

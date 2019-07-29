import java.util.Scanner;

public class Cau29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        for (int i = 1; i<= h; i++){
            for (int j = 1; j <= h - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i - 1 ; k++) {
                if ( k == 1 || k == 2*i - 1 || i == h)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");

        }
    }
}

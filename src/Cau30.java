import java.util.Scanner;

public class Cau30 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        for (int i = 1; i <= h  ; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

}

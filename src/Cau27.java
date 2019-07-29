import java.util.Scanner;

public class Cau27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        for (int i = 1; i < n ; i++) {
            if (i % 2 == 1){
                if ( i != 7 && i != 21 && i != 41){
                    System.out.println(i);
                }
            }
        }
    }
}

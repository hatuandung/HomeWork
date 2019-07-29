import java.util.Scanner;

public class Cau19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean check = true;
        for (int i = 2; i < n  ; i++) {
            if (n % i == 0) check = false;
        }

        if (check == false) System.out.println(n + " khong la so nguyen to");
        else System.out.println(n + " la so nguyen to");
    }
}

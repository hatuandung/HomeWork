import java.util.Scanner;

public class Cau20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean check = false;

        for (int i = 0; i < n; i++) {
            if (Math.sqrt(n) == i) {
                check = true;
                //System.out.println(i);
            }
        }

        if (check == false) System.out.println(n + " khong la so chinh phương");
        else  System.out.println(n + " la so chinh phương");
    }
}

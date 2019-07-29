import java.util.Scanner;

public class Cau25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) System.out.println(year + " la nam nhuan");
        else System.out.println(year + " khong phai nam nhuan" );
    }
}

import java.util.Scanner;

public class Cau23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double x;

        if (a == 0 && b != 0) System.out.println("vo nghiem");
        else if (a == 0 && b == 0) System.out.println("vo so nghiem");
        else if (a != 0){
            x = (-b * 1.0) / a;
            System.out.println(x);
        }

    }
}

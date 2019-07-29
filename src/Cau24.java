import java.util.Scanner;

public class Cau24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0) System.out.println("vo nghiem");
            else if (b == 0 && c == 0) System.out.println("vo so nghiem");
            else System.out.println("1 nghiem: " + (1.0 * -c) / b);
        }else {
            double delta = b * b - 4 * a * c;
            double x1;
            double x2;

            if (delta > 0) {
                x1 = ((-b + Math.sqrt(delta))  / (2 * a));
                x2 = ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);

            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("nghiem kep: " + x1);
            } else System.out.println("vo nghiem");
        }



    }
}

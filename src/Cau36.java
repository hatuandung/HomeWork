import java.util.Scanner;

public class Cau36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("nhap b: ");
        double b = scanner.nextDouble();
        boolean loop = true;

        double ketQua = 0;
        while (loop) {

            System.out.println("Chon phep tinh:");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. %");
            int select = scanner.nextInt();

                switch (select) {
                    case 1:
                        ketQua = a + b;
                        break;
                    case 2:
                        ketQua = a - b;
                        break;
                    case 3:
                        ketQua = a * b;
                        break;
                    case 4:
                        ketQua = a / b;
                        break;
                    case 5:
                        ketQua = a % b;
                        break;
                    default:
                        //System.out.println("thoát");
                        //ketQua = 0;
                        loop = false;
                        break;
                }

            System.out.println(ketQua);
        }

    }
}

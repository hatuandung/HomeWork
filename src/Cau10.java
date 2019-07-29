import java.util.Scanner;

public class Cau10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x:");
        double x = scanner.nextDouble();
        System.out.println("Nhập n:");
        double n = scanner.nextDouble();

        double ketQua = Math.pow(x, n);
        System.out.println(ketQua);
    }

}

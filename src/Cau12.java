import java.util.Scanner;

public class Cau12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x:");
        double x = scanner.nextDouble();
        System.out.println("Nhập n:");
        double n = scanner.nextDouble();
        double ketQua = 0;
        for (int i = 1; i <=n ; i++) {
            ketQua = ketQua + Math.pow(x, i);
        }

        System.out.println(ketQua);
    }
}

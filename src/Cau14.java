import java.util.Scanner;

public class Cau14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x:");
        double x = scanner.nextDouble();
        System.out.println("Nhập n:");
        double n = scanner.nextDouble();
        double ketQua = 0;
        for (int i = 0; i <= n; i++) {
            ketQua = ketQua + Math.pow(x, i * 2 +1);
        }

        System.out.println(ketQua);
    }
}

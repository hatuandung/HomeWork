import java.util.Scanner;

public class Cau9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double ketQua = 1;
        for (int i = 1; i <= n; i++) {
            ketQua = ketQua *  i;
        }

        System.out.println(ketQua);
    }
}

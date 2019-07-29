import java.util.Scanner;

public class Cau34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toan = scanner.nextDouble();
        double ly = scanner.nextDouble();
        double hoa = scanner.nextDouble();


        String maHs = scanner.nextLine();

        String tenHs = scanner.nextLine();

        double trungBinh = (toan + ly + hoa ) / 3;
        String xepLoai = null;

        if (trungBinh < 4)xepLoai = "yeu";
        if (trungBinh >= 4 && trungBinh < 6.5) xepLoai = "trung binh";
        if (trungBinh >= 6.5 && trungBinh < 8) xepLoai = "kha";
        if (trungBinh >= 8) xepLoai = "gioi";

        System.out.println(maHs);
        System.out.println(tenHs);
        System.out.println(xepLoai);
    }
}

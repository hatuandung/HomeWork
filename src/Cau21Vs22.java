import java.util.Scanner;

public class Cau21Vs22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập m:");
        int m = scanner.nextInt();
        System.out.println("Nhập n:");
        int n = scanner.nextInt();

        int UCLN, BCNN, temp1, temp2;
        temp1 = m;
        temp2 = n;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 = temp1 - temp2;

            } else {
                temp2 = temp2 - temp1;
            }
        }
        UCLN = temp1 ;
        BCNN = m * n / UCLN;

//        System.out.println(m);
//        System.out.println(n);

        System.out.println(UCLN);
        System.out.println(BCNN);
    }
}

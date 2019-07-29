import java.util.Date;
import java.util.Scanner;

public class Cau35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int date = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();



        System.out.println(name + " tuoi " + (2019 - year));


    }
}

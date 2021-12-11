import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;
        int total = 0;

        do {
            System.out.println("Lütfen bir sayı giriniz :");
            a = scan.nextInt();

            if (a % 4 == 0) {

                total += a;
            }
        } while (a % 2 == 0);


        System.out.println("Toplam :" + total);
    }
}

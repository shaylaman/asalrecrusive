import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print(" Bir Sayı giriniz : ");
        int sayi = inp.nextInt();
        isAsal(sayi, 2);
    }

    static boolean isAsal(int sayi, int i) {


        if (i == sayi) {
            System.out.println(sayi + "  asal sayıdır.");
            return true;

        } else if (sayi % i == 0) {
            System.out.println(sayi + "  asal sayı değildir.");
            return false;

        }

        return isAsal(sayi, i + 1);

    }

}

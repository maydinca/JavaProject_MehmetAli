package KendimeDersler;

import java.util.Scanner;

public class intToDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 2 double girin");

        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();

//        System.out.println(sayi1/sayi2);

        double bolum=(double)(sayi1/sayi2);

        System.out.println(bolum);

    }

}

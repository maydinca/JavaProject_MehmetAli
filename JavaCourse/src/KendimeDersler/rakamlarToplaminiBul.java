package KendimeDersler;

import java.util.Scanner;

public class rakamlarToplaminiBul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam girin: ");
        int rakam = scan.nextInt();
        int birlerBasamagi = rakam / 10;
        int rakamlarToplami = 0;

        for (int i = 0; i <rakam ; i--) {
            rakamlarToplami=rakamlarToplami+ (rakam % 10);
            rakam /= 10;  // Rakam = Rakam / 10;
        }

        System.out.println("++++++++++");
        System.out.println("SAYILARIN RAKAMLARI TOPLAMI : "+rakamlarToplami);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        while (rakam > 0) {
            rakamlarToplami += rakam % 10;
            System.out.println(rakamlarToplami); //rakamlarToplami= rakamlarToplami+rakam%10;
            rakam /= 10;  // Rakam = Rakam / 10;
        }
        System.out.println("Girilen sayinin Rakamlarinin Toplami = " + rakamlarToplami);
    }
}


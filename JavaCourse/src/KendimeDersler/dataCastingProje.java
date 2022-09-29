package KendimeDersler;

import java.util.Scanner;

public class dataCastingProje {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a number");
        int sayi=scan.nextInt();
        byte yenisayi =(byte)sayi;


        System.out.println(yenisayi);

    }
}

package KendimeDersler;

import java.util.Scanner;

public class ReCapProje1 {
    public static void main(String[] args) {

        /*        Mini Proje Asal Sayi


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi girin");
        int number = scan.nextInt();
//        System.out.println(number);
//        int remainder = number % 2;
//        System.out.println("remainder = " + remainder);
        boolean isPrime = true;
        if (number == 1) {
            System.out.println("Gecersiz sayi degildir");
               }
        System.out.println("-------");
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("sayi asal");
        } else {
            System.out.println("asal sayi ddegil");
        }
    }
}

package IfElseStatements;

import java.util.Scanner;

public class IfElseStatement04 {
    public static void main(String[] args) {
       /* Kullanicinin boyunu kilosunu isteip vucut kitle endeksini hesapla
                kilo*10000 /(boy*boy)
          Vucut kitle endeksi 30 dan buyukse obez
          20-30 arasi kilolu
          20-25 normal
          20 den kucukse zayif

        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu girniz");
        Double kilo= scan.nextDouble();

        System.out.println("Lutfen boyunuzu girniz");
        Double boy= scan.nextDouble();
        System.out.println("boyunuz"+boy);
        System.out.println("kilonuz"+kilo);

        double vke = kilo*10000 / (boy*boy);
        System.out.println("Vucut kitle endexiniz"+vke);

        if (vke>=30) {
            System.out.println("obez");
        } else if (vke>=25) {
            System.out.println("kilolu");
        } else if (vke>=20) {
            System.out.println("normal");
        } else{
            System.out.println("zayif");
        }

    }

}

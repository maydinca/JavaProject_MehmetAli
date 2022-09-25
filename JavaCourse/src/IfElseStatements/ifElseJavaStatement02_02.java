package IfElseStatements;

import java.util.Scanner;

public class ifElseJavaStatement02_02 {
    /*
Kullanicidan cinsiyetini ve yasini alin Kadin 60  ve uzerinde, erkek 65 ve uzerinde emekli olabilir
Yasini ve cinsiyetini dikkate alarak emekli olabilirsin veya Emekli olman icin yil daha ihtiyacin var desin
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Cinsiyet giriniz");
        String cinsiyet= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas =scan.nextDouble();
        //Once degiskenlerden birini ana degisken secelim
        //Mesela cinsiyeti sece;im ve ona gore ana yapiyi olustutalim

        if (cinsiyet.equalsIgnoreCase("Kadin")) {
            //Kadin bolumu
            if (yas<0 || yas>90){
                System.out.println("Yas girisi gecersiz");
            } else if (yas<60){
                System.out.println("Emekli olmak icin " +(60 - yas)+" yil daha calisman gerek");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            //Erkek
            if (yas < 0 || yas > 110) {
                System.out.println("Girilen yas gecersizdir");
            } else if (yas <=65) {
                System.out.println("Emekli olman icin " + (65 - yas)+ "yil daha calisman gerekir");
            } else {
                System.out.println("Emekli olanbilirsin");
            }
        }else {
                System.out.println("cinsiyet girisi gecersiz");
        }

        }
    }

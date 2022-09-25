package IfElseStatements;

import java.util.Scanner;

public class ifElseStatement02_02Cozum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet=scan.nextLine();
        double yas = scan.nextDouble();
        
        //Once degiskenlerden birini ana degisken yapalim
        // mesela yasi secelim ve ona gire ana yapiyi kuralim
        
        if(yas<0 || yas>90) {
            System.out.println("girilen yas gecersiz");
        } else if (yas<60) {
            if (cinsiyet.equalsIgnoreCase("kadin")) {
                System.out.println("Emekli olman icin " + (60 - yas) + " sene daha calisman gerek");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("emekli olman icin " + (65 - yas) + " sene daha calisman gerekiyor");
            }else{
                System.out.println("Grilen cinsiyeet gecersiz");

            }

        }
    }
}

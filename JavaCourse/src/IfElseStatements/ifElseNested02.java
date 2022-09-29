package IfElseStatements;

import java.util.Scanner;
/*
Kullanicidan cinsiyetini ve yasini alin Kadin 60  ve uzerinde, erkek 65 ve uzerinde emekli olabilir
Yasini ve cinsiyetini dikkate alarak emekli olabilirsin veya Emekli olman icin yil daha ihtiyacin var desin
 */
public class ifElseNested02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi girin");
        String cinsiyet = scan.nextLine();
        System.out.println();
        System.out.println("Lutfen yasinizi girin");
        double yas = scan.nextDouble();

        if (yas<0 || yas>90){
        System.out.println("Girilen yas gecersizdir");
        }else if (!(cinsiyet.equalsIgnoreCase("Kadin") ||
                cinsiyet.equalsIgnoreCase("Erkek"))) {
            System.out.println("Girilen cinsiyet geceriz");
        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas>60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas<60) {
            System.out.println("emekli olmak icin"+(60-yas)+ "yil daha calisman gerek");
        } else if (cinsiyet.equalsIgnoreCase("Erkek")&& yas>=65){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas<65){
            System.out.println("emekli olmak icin"+ (65-yas)+"yil daha calisman gerek");

        }
    }
}
package IfElseStatements;

import java.util.Scanner;

public class IfElseStatement03 {
    //ogrencinin notu 85 ve uzeri AA
    //65 ve ustu BB
    //50 ve ustu cc
    //50 den asagi dd
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu girin");
        Double OgrenciNotu = scan.nextDouble();

        if (OgrenciNotu > 100 || OgrenciNotu<0){
            System.out.println("Gecersiz not");
        } else if (OgrenciNotu >= 85) {
            System.out.println("Notunuz AA");
        } else if (OgrenciNotu >= 65) {
            System.out.println("Notunuz BB");
        } else if (OgrenciNotu >= 50) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Notunuz DD");
        }
    }
}
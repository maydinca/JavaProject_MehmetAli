package IfElseStatements;

import java.util.Scanner;

public class ifElseStatements02 {
    //kullanicidan notunu alun 50 den fazlaysa sinifi gecti egilse malesef kaldin yazdirin
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        float not =scan.nextFloat();

        if (not>=50) {
            System.out.println("gectin");
        }else{
            System.out.println("kaldin");
        }
    }
}

package IfElseStatements;
import java.util.Scanner;



public class ifElseNested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bayan yasi girin");
        int kadinYasi = scan.nextInt();

        System.out.println("Lutfen erkek yasi girin");
        int erkekYasi = scan.nextInt();

        if (kadinYasi >= 65) {
            System.out.println("Kadin emekli olabilir");
        } else {
            System.out.println("Kadin Emekli olamaz");
        }
        if (erkekYasi >= 65) {
            System.out.println("Erkek emekli olabilir");
        } else {
            System.out.println("Erkek emekli olamaz");
        }

    }
}
package IfElseStatements;

import java.util.Scanner;
// Kullanicidan ucgenin kenarlarini alin, kenarlari esit ise eskanar degilse eskenar degil yazdirin
public class ifElse01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini giriniz!");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgendir");
           } else{
            System.out.println("Es kenar degil");
        }
    }
}

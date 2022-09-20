package IfElseStatements;

import java.util.Scanner;

public class ifElseStatement05 {
    /*
    kullanicidan bir tam sayi al uc ile bolunurse "uc ile bolunebilen tam sayi"
    5 ile bolunurse "5 ile bolunebilen tam sayi"
    hem 3 hem de 5 ile bolunurse "super tam sayi " yazdir
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen tam sayi gir");
        Double tamsayi = scan.nextDouble();

        System.out.println("Tam sayiniz ;"+ tamsayi);

        if (tamsayi%3==0 &&tamsayi%5==0) {
            System.out.println("Super Sayi");
        } else if (tamsayi%3==0) {
            System.out.println("3 e bolunebilen sayi");
        } else if (tamsayi%5==0) {
            System.out.println("5 e boluebilen tam sayi");
        }else {
            System.out.println("tam Bolunemez");

        }

    }

}
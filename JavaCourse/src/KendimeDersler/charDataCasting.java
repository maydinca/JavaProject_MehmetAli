package KendimeDersler;

import java.util.Scanner;

public class charDataCasting {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bir karakter girin");
        char karakterim=scan.next().charAt(0);
        System.out.println(""+(char)(karakterim+1)+(char)(karakterim+2)+(char)(karakterim+3));
    }

}

package KendimeDersler;

public class Ornekler01 {
    public static void main(String[] args) {
        int i = 0;
        //for dongusu kullanarak
        for (i = 0; i < 10; i++) {
            System.out.println("Deger: " + i);}
        //standart kullanim
        System.out.print("i: ");
        for (i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //azaltarak kullanım
        System.out.print("\nj: ");
        for (int j = 10; j >= 0; j--) {
            System.out.print(j + " ");
        }
        //5ten 10a kadar
        System.out.print("\nk: ");
        for (int k = 5; k <= 10; k++) {
            System.out.print(k + " ");
        }
        //0dan 100 e 10ar 10ar
        System.out.print("\nl: ");
        for (int l = 0; l <= 100; l += 10) {
            System.out.print(l + " ");
        }
        //50den 0a 5er 5er
        System.out.print("\nm: ");
        for (int m = 50; m >= 0; m -= 5) {
            System.out.print(m + " ");
        }
    }
}



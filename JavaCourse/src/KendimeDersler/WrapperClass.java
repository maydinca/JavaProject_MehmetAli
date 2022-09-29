package KendimeDersler;

public class WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str = "Java Cok Guzel";
        System.out.println("---------");

        char krk='b';
        Character krkwrapper='c';

        System.out.println(Character.isLetter('5'));
        System.out.println(Character.isDigit(7));

        String str1="123";
        String str2="12";
        //str 1 ve str2 in degerleri matematiksel olarak toplayin
        System.out.println(str1+str2);
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        System.out.println("--------------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("--------------");


        // integer. parseInteger (str1) icine yazilan str rakamlardan olusuyorsa str i int a cevir.
    }
}

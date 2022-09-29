package KendimeDersler;

import com.sun.source.tree.WhileLoopTree;

public class DogalSayilarToplami {
    public static void main(String[] args) {
        int toplam= 0;
        int i=0;
        while (i<20){
            System.out.println(toplam= toplam+i);
            i++;
        }
        System.out.println("1 den 20 ye rakamlar toplami : "+ toplam);


    }
}

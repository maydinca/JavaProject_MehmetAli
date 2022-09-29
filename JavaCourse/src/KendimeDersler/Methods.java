package KendimeDersler;

public class Methods {
    public static void main(String[] args) {
sayiBulmaca();
sayiBulmaca();
sayiBulmaca();
sayiBulmaca();
    }
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 10;
        boolean varMi = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (i == aranacak) {
                varMi = true;
                break;
            }

        }
        if (varMi) {
            System.out.println("Sayı mevcuttur :"+ aranacak);
        } else {
            System.out.println("Sayı mevcut değildir : "+aranacak);
        }
    }
    public static void cevapVer (int aranacak){
        System.out.println("Sayı mevcuttur :"+ aranacak);

    }
}


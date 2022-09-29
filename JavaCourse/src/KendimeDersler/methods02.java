package KendimeDersler;

public class methods02 {
    //write your code here
    public static void main(String[] args) {
        ekle();
        sil();
        guncelle();
        System.out.println("============");
        String mesaj ="Bugun hava cok guzel";
              String yenimesaj=mesaj.substring(0,2);
        System.out.println(yenimesaj);
    }

    public static void ekle(){
        System.out.println("eklendi");
    }
    public static void sil(){
        System.out.println("silindi");
    }

    public static void guncelle(){
        System.out.println("guncellendi");
    }
}

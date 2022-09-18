package Day29.Practice;public class MethodMehmetAliPractice {
    public static void main(String[] args) {
        MethodMehmetAliPractice mp=new MethodMehmetAliPractice();

        System.out.println("sonuc= "+mp.maho(5,8,2));

    }
    int maho(int a, int b, int c){
        int sonuc = a*b/c;
        return sonuc;
    }
}

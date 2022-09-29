package KendimeDersler;

public class reCapDemo {
    public static void main(String[] args) {

//        double [] myList = new double[4];

        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double toplam = 0;
        double max = myList[0];


//        for (double i = 0; i < myList.length; i++) {
//            System.out.println("Elemanlar :"+myList);
        for (double number:myList){
            if (max < number) {
                max = number;
            }

            toplam = toplam + number;
            System.out.println(number);

        }
        System.out.println("En Buyuk = " + toplam);
        System.out.println("Toplam = " + max);

    }
}

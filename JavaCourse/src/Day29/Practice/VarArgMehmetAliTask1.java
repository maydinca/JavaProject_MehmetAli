package Day29.Practice;

public class VarArgMehmetAliTask1 {
    // Create a void method which will have a String (student name) and int varargs (grade) as parameters.
    // print name of the student, and average of the grades.
    // (Furkat Ali, 50,60,70) => Furkat Ali : 60

    void ogrenci(String name, int... grades) {

        double sum = 0;
        double avg = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            avg = sum / grades.length;
        }
        System.out.println(name + ": " + avg);
    }

    public static void main(String[] args) {
        VarArgMehmetAliTask1 va = new VarArgMehmetAliTask1();

        va.ogrenci("Ufuk", 94, 87, 100, 96, 71);
    }
}
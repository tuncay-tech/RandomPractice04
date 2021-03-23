import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        //Girilen vize ve final notuna göre öğrencinin
        // kalıp kalmadığını ekrana yazan programı Java dilinde yazınız.
        Scanner girdi = new Scanner(System.in);
        System.out.print("Vize notu giriniz: ");
        int vizeNot = girdi.nextInt();
        System.out.print("Final notu giriniz: ");
        int finalNot = girdi.nextInt();
        if (vizeNot * 0.4 + finalNot * 0.6 >= 50)  // bu yazım güzelll
            System.out.print("Ogrenci gecti");
        else
            System.out.print("Ogrenci kaldi");
    }
}

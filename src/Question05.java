import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        // Girilen sayının mutlak değerini ekrana yazan programı Java dilinde yazınız.
        //  // Mutlak deger fonksiyonu : Math.abs(sayi);
        Scanner inPut = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int a = inPut.nextInt();

        if (a > 0) {
            System.out.println("sayının mutlak değeri: " + a);

        } else if (a < 0) {
          a *= -1;       // a = -a;   böylde olanilir
            System.out.println("sayının mutlak değeri: " + a);
        } else {
            System.out.println("sayının mutlak değeri 0 dır");
        }
    }
}

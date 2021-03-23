import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        // Klavyeden girilen bir sayının tek mi çift mi olduğunu ekrana yazan programı Java dilinde yazınız.

        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        sayi = scanner.nextInt();
        if (sayi % 2 == 0){
            System.out.println("çift sayı");
        }else {
            System.out.println("tek sayı");
        }


    }
}

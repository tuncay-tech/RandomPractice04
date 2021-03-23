import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        //Girilen kenar uzunluklarına göre üçgen oluşturup
        // oluşturmadığını eğer oluşturuyorsa
        // çevre ve alanını ekrana yazan programı Java dilinde yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenar giriniz: ");
        float a = input.nextInt();
        System.out.print("2. kenar giriniz: ");
        float b = input.nextInt();
        System.out.print("3. kenar giriniz: ");
        float c = input.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("eşkenar üçgen");
            } else if (a != b && b != c && a != c) {
                System.out.println("çeşitkenar üçgen");
            } else {
                System.out.println("ikiz kenar üçgen");
            }
            float cevre = a + b + c;
            float u = cevre/ 2;
            float alan = (float) Math.sqrt(u*(u-a)*(u-b)*(u-c));
            System.out.println("çevre: " + cevre);
            System.out.println("alan: " + alan);
        }else {
            System.out.println("üçgen oluşturmaz");
        }
    }
}

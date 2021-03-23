import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        // ax²+bx+c=0 verilen denklemin köklerini bulan ve
        // ekrana yazan programı Java dilinde yazınız.

        Scanner inPut = new Scanner(System.in);
        System.out.print("a sayısnı giriniz : ");
        float a = inPut.nextInt();
        System.out.print("b sayısnı giriniz : ");
        float b = inPut.nextInt();
        System.out.print("c sayısnı giriniz : ");
        float c = inPut.nextInt();

        float delta = (float) (Math.pow(b, 2) - 4 * a * c);

        if (delta > 0) {
            float x1 = (float) (-b + Math.sqrt(delta)) /2*a;
            float x2 = (float) (-b - Math.sqrt(delta)) /2*a;
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
        }else if (delta == 0){
            float x1 = -b/2*a;
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x1);
        }else {
            System.out.println("reel kök yoktur");
        }

    }
}

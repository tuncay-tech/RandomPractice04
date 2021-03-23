import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        double vizeNotu, finalNotu, devamNotu, gecmeNotu;
        System.out.print("vize notunuzu giriniz: ");
        vizeNotu = girdi.nextDouble();
        System.out.print("final notunu girniz: ");
        finalNotu = girdi.nextDouble();
        System.out.print("devam puanını giriniz: ");
        devamNotu = girdi.nextDouble();

        gecmeNotu = ((vizeNotu / 100) * 40) + ((finalNotu / 100) * 50) + ((devamNotu / 100) * 10);

        if (gecmeNotu > 0 && gecmeNotu < 45) {
            System.out.println(gecmeNotu + " >> " + "kaldınız maalesef çalışmaya devam");
        } else if (gecmeNotu >= 45 && gecmeNotu < 75) {
            System.out.println(gecmeNotu + " >> " + "normal geçtiniz");
        } else if (gecmeNotu >= 75 && gecmeNotu <= 100) {
            System.out.println(gecmeNotu + " >> " + "iyi geçtiniz ");
        } else {
            System.out.println("geçerli bir nor giriniz");
        }
    }
}

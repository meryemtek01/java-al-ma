package halukh_taskÇalışma.tasks06_SwitchCase.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("L�tfen harf giriniz");

        char harf = scan.next().charAt(0);

        switch (harf) {
            case 'v':
            case 'V':
                System.out.println("Very");
                break;
            case 'I':
            case 'i':
                System.out.println("Important");
                break;
            case 'P':
            case 'p':
                System.out.println("Person");
                break;
            default:
                System.out.println("gecersiz harf");
        }

        // Kullanicinin birden fazla harf girmesini sorun olarak kabul ediyorsaniz
        // ve bunu hata olarak kullaniciya bildirmek istiyorsaniz

        System.out.println("L�tfen harf giriniz");
        String str = scan.next();
        switch (str) {
            case "v":
            case "V":
                System.out.println("Very");
                break;
            case "I":
            case "i":
                System.out.println("Important");
                break;
            case "P":
            case "p":
                System.out.println("Person");
                break;
            default:
                System.out.println("gecersiz harf");
        }
    }
}

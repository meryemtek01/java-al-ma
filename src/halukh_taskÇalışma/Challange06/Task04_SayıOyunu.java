package halukh_taskÇalışma.Challange06;

import java.util.Scanner;

public class Task04_SayıOyunu {

    /*
    Task->
       Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sayitoplami = 0;
        int girilensayiadeti = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "  sayi giriniz:");
            int sayi = input.nextInt();
            sayitoplami += sayi;
            girilensayiadeti++;

            if (sayitoplami >= 100) {
                System.out.println("sayitoplami "+sayitoplami);
                System.out.println("girilensayi "+girilensayiadeti);

                break;
            }

        }
    }
}

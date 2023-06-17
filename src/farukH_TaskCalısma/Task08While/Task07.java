package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz

        Scanner oku = new Scanner(System.in);

        int enB = 0;
        int sayac = 1;
        while (sayac <= 5) {
            System.out.print(sayac + ".Sayı giriniz= ");
            int sayi = oku.nextInt();

//            if (sayi > enb)
//                enb = sayi;

            enB = Math.max(enB, sayi);
            sayac++;
        }

        System.out.println("enb = " + enB);
    }
}

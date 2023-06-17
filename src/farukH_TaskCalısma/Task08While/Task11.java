package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scan = new Scanner(System.in);

        int sayi=0;
        int toplam=0;
/*
        for (int i = 1; i <1000000 ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();

            if (sayi==0){
             break;
            } else {
                toplam+=sayi;
            }

        }
        System.out.println(toplam);
 */




        sayi=1;
        toplam=0;

        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);

        // baslangic,bitis ve degisim degerleri net olan durumlarda for loop daha avantajlidir
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir









    }
}

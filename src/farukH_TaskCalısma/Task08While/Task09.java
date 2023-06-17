package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı toplanmak istersiniz? : ");int sayiAdedi= scan.nextInt();
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen "+ sayiAdedi + " sayinin toplami : " + toplam);


        // while ile yapalim
        sayi=0;
        toplam=0;
        int sayac=1;

        while (sayac<=sayiAdedi){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }

        System.out.println("girilen "+ sayiAdedi + " sayinin toplami : " + toplam);
    }

}

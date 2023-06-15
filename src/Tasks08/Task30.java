package Tasks08;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri icin 2 pozitif tamsayi giriniz");

        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();

        if (bitis<baslangic){
            System.out.println("Baslangic degeri bitis degerinden kucuk olmali");
        }else{
            int toplam=0;

            for (int i = baslangic; i <=bitis ; i++) {

                toplam += i; // tum sayilari sirasi ile toplam'a ekledik
            }
            System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami : " + toplam);
        }
        // cozum 2
        if (bitis<baslangic) {
            int temp=baslangic;
            baslangic = bitis;
            bitis=temp;
        }
        int toplam =0;
        for (int i = baslangic; i <=bitis ; i++) toplam += i;
        System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami : " + toplam);
    }
}

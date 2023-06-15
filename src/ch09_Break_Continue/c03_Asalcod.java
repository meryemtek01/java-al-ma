package ch09_Break_Continue;

import java.util.Scanner;

public class c03_Asalcod {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı:
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = input.nextInt();
        boolean asalmı = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(sayi + "  sayısı asal değil ");
                asalmı=false;
                break;
            }

        }
if (asalmı && sayi!=1){
    System.out.println(sayi +  " sayı asal sayıdır");
}else System.out.println("asal değil");

    }
}

package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise //nester burada devereye giriyor
10 dan kucuk olup olmadigini kontrol ediniz.

10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.

Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı  giriniz:");
        int sayi= input.nextInt();
        String sonuc = sayi >= 0 ? (sayi > 10 ? "Rakam" : "Pozitif Sayi") : "negatif sayi";
        System.out.println("result: " + sonuc);
        System.out.println(sayi >= 0 ? (sayi < 10 ? "Rakam" : "Pozitif Sayi") : "Negatif Sayi");

    }
}

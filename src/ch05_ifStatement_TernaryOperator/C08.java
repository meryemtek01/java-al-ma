package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        /*
Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
 Eğer urun miktarı 100 den fazla ise %33  indirim yapıp
       ödemesi gereken toplam miktarı print eden code create ediniz.
*/
        Scanner input=new Scanner(System.in);
        System.out.println("ürün miktarını giriniz:");
        int urunmiktar= input.nextInt();
        System.out.println("ürün birim fiyatını giriniz:");
        int urunfiyat=input.nextInt();
        double fatura=  urunmiktar>100 ? (urunfiyat*urunmiktar*0.67) :(urunfiyat+urunmiktar);
        System.out.println("fatura"+fatura);


    }
}

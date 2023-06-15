package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
       /*
  TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

 */
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayı  giriniz:");
        int sayi1= input.nextInt();
        System.out.println("Birinci sayı  giriniz:");
        int sayi2= input.nextInt();
        //dört işlem sonucunu buraya yazalım kodları
        int toplam=sayi1+sayi2;
        int cikarma=sayi1-sayi2;
        int bölme=sayi1/sayi2;
        int carpma=sayi1*sayi2;
        System.out.println("hangi işlem sonucunu görmek istersin toplama için 1 e"+"\ncıkartma için 2 e \nbölme içi 3 e \nçarpma için 4 e bas");
        int secim= input.nextInt();
        if (secim==1) {
            System.out.println("toplam" + toplam);
        } else if (secim==2) {
            System.out.println("cıkartma" + cikarma);
        } else if (secim==3) {
            System.out.println("bölme=" + bölme);
        } else if (secim==4) {
            System.out.println("carpma=" + carpma);
        }
        }





}

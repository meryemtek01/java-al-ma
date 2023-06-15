package halukh_taskÇalışma.Challange03;

import java.util.Scanner;

public class Task05_NestedIfTernary {
    /* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bizim ooolan bi sayi  giresen :");

        int sayi = input.nextInt();

        String sonuc =  sayi==0?"Zero":
                sayi==1?"One":
                        sayi==2?"Two":
                                sayi==3?"Three":
                                        sayi==4?"Four":
                                                sayi==5?"Five":
                                                        sayi==6?"Six":
                                                                sayi==7?"Seven":
                                                                        sayi==8?"Eight":
                                                                                sayi==9?"Nine":"Geçersiz";


        System.out.println("sonuc = " + sonuc);
    }// main sonu
}

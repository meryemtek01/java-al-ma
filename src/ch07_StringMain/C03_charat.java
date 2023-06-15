package ch07_StringMain;

import java.util.Scanner;

public class C03_charat {
    public static void main(String[] args) {
        /*
       charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
       index değeri 0'dan başlar
        */
        String city="İstanbul";
        //city variable nin birinci karakterini bulun yazdırın
        System.out.println("city.charAt(0)= "+city.charAt(0));//city.charAt(0)= İ
        //city variable nin birinci indexteki elemanı  bulun yazdırın
        System.out.println("city.charAt(1)"+city.charAt(1));//city.charAt(1)s

        char citybirinciIndexelemanı=city.charAt(1);
        System.out.println("citybirinciIndexelemanı="+ citybirinciIndexelemanı);
    //task son karakteri alın atama ile yazdıran kod yazınız
        System.out.println("city.charAt(city.length()-1) = " + city.charAt(city.length() - 1));
//(city.length()-1) herzaman son karakteri alır
        System.out.println("city.charAt(city.length() - 1)="+city.charAt(city.length() - 1));

        int sonHarfIndexi=city.length()-1;
        System.out.println("city.charAt(city.length() - 1)="+sonHarfIndexi);
//task alınan son karakteri
        char sonharf=city.charAt(sonHarfIndexi);
        System.out.println("sonharf="+sonharf);
       // System.out.println("city.chart(21)="+city.charAt(21));

// Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri
// print eden code create ediniz...
        Scanner input =new Scanner(System.in);
        System.out.println("şehir gir");
        String sehir= input.nextLine();

        if (sehir.length()%2==0){// harf sayısı iki ini tam katı ise ortanca harf yoktur
            System.out.println(" orta karakteri yoktur");
        }else
            System.out.println(sehir.charAt((sehir.length()) / 2));

    }
}

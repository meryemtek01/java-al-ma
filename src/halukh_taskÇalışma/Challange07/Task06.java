package halukh_taskÇalışma.Challange07;

import java.util.Scanner;

public class Task06 {

    /* task->
     Girilen  isim ve soyismin ilk harflerini büyük
     diğer harflerini küçük harf olarak print eden method create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam aadınızı gireceksiniz : ");
        String ad = input.nextLine();

        System.out.println("Agam sayadınızı gireceksiniz : ");
        String soyad = input.nextLine();
        System.out.println("name(ad,soyad) = " + name(ad, soyad));

    }//main sonu

    public static String name(String ad,String soyad) {
      return   (ad.substring(0,1).toUpperCase())+(ad.substring(1).toLowerCase())+" "+
        (soyad.substring(0,1).toUpperCase())+(soyad.substring(1).toLowerCase());

    }


}//class sonu

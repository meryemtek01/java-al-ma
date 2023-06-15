package halukh_taskÇalışma.task04Solutions;

import java.util.Scanner;

public class Task09 {
     /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını hesaplayalım.

     */
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         System.out.print("Lütfen inek sayısını giriniz : ");
         int inekSayisi = scan.nextInt();

         System.out.print("Lütfen koyun sayısını giriniz : ");
         int koyunSayisi = scan.nextInt();

         System.out.print("Lütfen tavuk sayısını giriniz : ");
         int tavukSayisi = scan.nextInt();

         int toplamAyak = inekSayisi * 4 + koyunSayisi*4 + tavukSayisi * 2;
         System.out.println("Toplam Ayak : " + toplamAyak);
         // 2. cozum
         toplamAyak = (inekSayisi+koyunSayisi)*4 + tavukSayisi *2;
         System.out.println("Toplam Ayak : " + toplamAyak);
        // 3.cozum, hiç beğenmedim bu çözümü
         toplamAyak = 2 * (tavukSayisi+ 2* (koyunSayisi+inekSayisi));
         System.out.println("Toplam Ayak : " + toplamAyak);

     }
}

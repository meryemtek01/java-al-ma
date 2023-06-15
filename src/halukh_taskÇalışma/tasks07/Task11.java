package halukh_taskÇalışma.tasks07;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ad ve SoyAd yazınız : ");
        String isim = scan.nextLine();
        int indexOfBosluk = isim.indexOf(' ');
        String ad   = isim.substring(0,indexOfBosluk);
        String soyAd= isim.substring(indexOfBosluk+1);
        System.out.println(ad);
        System.out.println(soyAd);
    }
}

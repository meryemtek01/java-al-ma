package halukh_taskÇalışma.tasks07;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ad ve SoyAd yazınız : ");
        String isim = scan.nextLine().toLowerCase(); // ahmet taş

        int soyIsimBaslangicIndexi = isim.indexOf(" ")+1; // 6
        isim = isim.substring(0,1).toUpperCase()  // A
                +isim.substring(1,soyIsimBaslangicIndexi) // hmet
                +isim.substring(soyIsimBaslangicIndexi,soyIsimBaslangicIndexi+1).toUpperCase() // T
                +isim.substring(soyIsimBaslangicIndexi+1);// aş
        System.out.println(isim);
        // 2 ön ad olması dikkate alınmadı

        // ahMet tAş
        // isim = "Ahmet Taş"
    }
}

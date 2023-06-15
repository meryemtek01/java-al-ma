package Tasks08;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        boolean sayi3unKuvvetidir = false;
        int carpim = 1;

        for (int i = 1; i < sayi / 3; i++) { //num/3 olamdan direk num da yazılabilir
            carpim *= 3;

            if (carpim == sayi) {
                sayi3unKuvvetidir = true;
                break;
            }
        }

        System.out.println("girilen sayi 3'un kuvvetidir : " + sayi3unKuvvetidir);


    }
}

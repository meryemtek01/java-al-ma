package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scan= new Scanner(System.in);

        boolean tekrarSifreIste= true;
        String sifre="";

        while (tekrarSifreIste){

            System.out.println("Lutfen sifrenizi giriniz");
            sifre= scan.nextLine();

            if (checkPassword(sifre)){ // sifre kontrolu true donerse sifre basarili demektir
                System.out.println("basari ile olusturuldu");
                // break;
                tekrarSifreIste=false; // break veya bu kod yazilabilir
            }

        }

    }

    public static boolean checkPassword(String sifre){

        boolean passWordOk=true;

        // - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            // ilk harf kucuk degilse hatayi yazdir
            // sifre.charAt(0)<'a' || sifre.charAt(0)>'z'
            System.out.println("Ilk harf kucuk harf olmali");
            passWordOk=false; // bir ceza puani aldi
        }

        // - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            // son karakter rakam degilse rapor yazdir
            System.out.println("Son karakter rakam olmali");
            passWordOk=false;
        }
        // - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            passWordOk=false;
        }
        // - uzunlugu en az 10 karakter olmali

        if (!(sifre.length()>=10)){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            passWordOk=false;
        }


        return passWordOk;

    }
}

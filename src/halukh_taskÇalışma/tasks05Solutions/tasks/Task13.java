package halukh_taskÇalışma.tasks05Solutions.tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner input = new Scanner(System.in);
        System.out.println("agam 1. sayı  giresen : ");
        int sayi1 = input.nextInt();
        System.out.println("agam 2. sayı  giresen : ");
        int sayi2 = input.nextInt();

        System.out.println("agam\n+ için -> 1 seçiniz \n- için -> 2 seçiniz \nx için -> 3 seçiniz \n/ için -> 4 seçiniz ");
        int islem= input.nextInt();

        if (islem ==1) {// toplama işlemi şartı
            System.out.println("toplama işlemi sonucu : "+sayi1+" + "+sayi2+" = "+(sayi2+sayi1));
        } else if (islem==2) { // çıkarma işlemi şartı
            System.out.println("çıkarma işlemi sonucu : "+sayi1+" - "+sayi2+" = "+(sayi1-sayi2));
        } else if (islem==3) {// çarpma işlemi şartı
            System.out.println("çarpma işlemi sonucu : "+sayi1+" x "+sayi2+" = "+(sayi2*sayi1));
        } else if (islem==4) {// bölme işlemi şartı
            System.out.println("bölme işlemi sonucu : "+sayi1+" / "+sayi2+" = "+(sayi1/sayi2));
        }else  // hiç bir şart sağlamazsa
            System.out.println(" agam ne istediğini bilmirsen  :( ");

    }
}

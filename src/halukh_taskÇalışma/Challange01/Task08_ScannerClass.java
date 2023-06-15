package halukh_taskÇalışma.Challange01;

import java.util.Scanner;

public class Task08_ScannerClass {
    /*
   girilen iki tam sayının toplam ve farkını print eden code create ediniz.

   */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Gardaş hele 1. sayı giresen : ");
        int sayi1=input.nextInt();

        System.out.print("Gardaş hele 2. sayı giresen : ");
        int sayi2=input.nextInt();

        System.out.println("girilen sayıların toplamı : "+(sayi1+sayi2)+ "\ngirilen sayıların farkı : "+(sayi1-sayi2));

    }
}

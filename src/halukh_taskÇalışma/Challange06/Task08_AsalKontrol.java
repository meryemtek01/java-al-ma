package halukh_taskÇalışma.Challange06;

import java.util.Scanner;

public class Task08_AsalKontrol {
    /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz  ");
        int sayi = input.nextInt();
        boolean asalmi = true;


        //while (sayi > 1) {
        //    if (sayi % (sayi - 1) == 0) {//sayı başka bir sayıya tam bölünüyor
        //        break;
        //    }
        //    if (asalmi) {
        //        System.out.println("girilen sayı asal:)");
        //    } else System.out.println("girilen asla sayı degil:(");


        //    sayi--;

        //}
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalmi = false;
                break;
            }

        }
        if (asalmi) {
            System.out.println("girilen sayı asal:)");
        } else System.out.println("girilen asla sayı degil:(");

    }
    }

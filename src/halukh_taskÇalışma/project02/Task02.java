package halukh_taskÇalışma.project02;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		 Task-> girilen sayıya kadar  tüm sayıların toplamını print eden METHOD create ediniz.
          Ornegin; 5, 4, 7, 0 ise 5+4+7=16

		  */

        Scanner input = new Scanner(System.in);

        sıfırakadarTopla();


    }//main sonu

    private static void sıfırakadarTopla() {
        Scanner input = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        do {
            System.out.print("bir sayı giriniz");
            sayi = input.nextInt();
            toplam+=sayi;

        } while (sayi != 0);

        System.out.println("toplam = " + toplam);
    }

}//clas son

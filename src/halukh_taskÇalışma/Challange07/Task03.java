package halukh_taskÇalışma.Challange07;

import java.util.Scanner;

public class Task03 {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Agam bir cm sayı giriniz : ");
        int cmsayi = input.nextInt();
        System.out.println("girilen cm nin m degeri"+ cmCevirMetre( cmsayi));
        System.out.println("girilen cm nin km degeri"+ cmCevirKilometre(cmsayi));

    }

    private static double cmCevirKilometre(int cmsayi) {
        return cmsayi/1000;
    }

    private static double cmCevirMetre(int cmsayi) {
        return cmsayi/100;
    }

}
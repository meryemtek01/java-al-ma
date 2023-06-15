package Tasks08_forLoopödev;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int toplam=0;
        for (int i =sayi1; i <=sayi2; i++) {
          if (i%2==0  ){
              System.out.println(i+" çift sayı");
              toplam+=i;
          }


        }
        System.out.println("toplam"+toplam);

    }

}























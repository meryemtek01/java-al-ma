package ch09_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        // Task-> girilen 7 tamsayının 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.
        Scanner input = new Scanner(System.in);
       int sur=0;
       int count=0;
       while (count<3){
           System.out.println("sayı giriniz");
           int num = input.nextInt();
           if (num>=10 && num>=20){
               count++;
               continue;

           }
           sur+=num;
           count++;

       }

        System.out.println("girilen 7 tam sayısının 10 ile 20 arasında toplamı"+sur);

    }



}

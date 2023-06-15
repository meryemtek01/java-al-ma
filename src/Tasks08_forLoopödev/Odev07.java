package Tasks08_forLoopödev;

import java.util.Scanner;

public class Odev07 {
  /*           *
              * *
             * ! *
            * ! ! *
           * ! ! ! *
          * * * * * *

   */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");

int n= input.nextInt();

        for (int i = 1; i <=n ; i++) {

            for (int j = n; j >=i; j--) {//boşluk
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                if (j==1 || j==i || i==n) {
                    System.out.print("* ");
                }else
                    System.out.print("! ");

            }

            System.out.println();
        }
        /* taha bey
         int i, j, k;
        for (i = 1; i <= 8; i++) {
            for (j = 8; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (i == 8) {
                    System.out.print(" *");
                } else {
                    if (k == i || k == 1) {
                        System.out.print(" *");
                    } else {
                        System.out.print(" !");
                    }
                }
            }
            System.out.println();//dumy
        }
         */

    }











}

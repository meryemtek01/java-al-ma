package halukh_taskÇalışma.Tasks08_forLoopFarukh;

import java.util.Scanner;

public class Odev07 {
    public static void main(String[] args) {



        /*
         *
         * *
         * ! *
         * ! ! *
         * ! ! ! *
         * ! ! ! ! *
         * ! ! ! ! ! *
         * * * * * * * *

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir boyut giriniz");
        int satir = input.nextInt();

        for (int i = 1; i <=satir ; i++) {
          //  System.out.print(" ");
           for (int k=satir; k>=i ; k--) {
               System.out.print(" ");
           }
            for (int j = 1; j <=i ; j++) {
                if (j==1 || j==i || i==satir){
                    System.out.print("* ");

                }else {
                    System.out.print("! ");
                }

            }
            System.out.println();
        }
    }

}

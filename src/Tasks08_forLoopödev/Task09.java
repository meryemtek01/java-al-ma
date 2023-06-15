package Tasks08_forLoopödev;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        //System.out.println("5 sayı giriniz");
     //   int n1 = input.nextInt();
       // int n2 = input.nextInt();
       // int n3 = input.nextInt();
      //  int n4 = input.nextInt();
     //   int n5 = input.nextInt();
        int toplam=0;
        for (int i = 1; i <=2; i++) {
            System.out.println(i+ ".sayı giriniz");
            int n = input.nextInt();
            if (n<=10 &&  n>=20){
                System.out.println("sayınız 10 ile 20 arasında");

            }else
                toplam+=n+toplam;
        }

        System.out.println("toplam="+toplam);
    }
}

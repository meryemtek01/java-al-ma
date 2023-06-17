package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task14 {

    //Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.

    public static void main(String[] args) {
        int n1,n2;
        Scanner scan =new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        n1=scan.nextInt();

        System.out.print("n2 sayısını giriniz ");
        n2=scan.nextInt();
        System.out.println();
        int i = 0;
        int ebob=0;
        int ekok=0;

        int kucukSayi,buyuksayi;
        if (n1>n2) {
            buyuksayi=n1;
            kucukSayi=n2;
        } else{
            buyuksayi=n2;
            kucukSayi=n1;
        }

        while ( i <= kucukSayi){
            i++;
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
        }
        System.out.println("En büyük ortak bölen = "+ebob);


        int j = buyuksayi;
        while (j<= (n1*n2)){

            if( j%n1==0 && j%n2==0){
                System.out.println("En küçük ortak kat   = "+j);
                break;
            }
            j++;
        }
    }
}

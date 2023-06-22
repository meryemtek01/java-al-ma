package halukh_taskÇalışma.Challange08;

import java.util.Scanner;

public class Task05 {

       /* task->
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        public static void main(String[] args) {
       /* task->
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
            int arr[] = new int[8];// 8 int eleman alacak bış bir arr tanımlandı
            Scanner input = new Scanner(System.in);
            int count = 0;//3'e tam bolunen arr eleman sayısı
            for (int i = 0; i < 8; i++) {
                System.out.print(i + ". index elamanını giriniz : ");
                arr[i] = input.nextInt();
                if (arr[i] % 3 == 0) {//döngüdeki her bir arr elamanınn 3'e tam bolunme sartı
                    count++;
                }
            }

            System.out.println("girilen arr'deki 3'e tam bolunen eleman sayısı : " + count);

        }
    }

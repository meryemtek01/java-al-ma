package halukh_taskÇalışma.project02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task05_EksikArrayEleman {
    /*
    Task-> 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı return eden  metod create ediniz..

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int[] arr1 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int[] arr2 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int[] arr3 = {7, 5, 10, 2, 4, 6, 8, 3, 9};

        //toplam (n*(n+1))/2
        System.out.println("eksikSayiyiBul(arr) = " + eksikSayiyiBul(arr));
        System.out.println("eksikSayiyiBul(arr1) = " + eksikSayiyiBul(arr1));
        System.out.println("eksikSayiyiBul(arr2) = " + eksikSayiyiBul(arr2));
        System.out.println("eksikSayiyiBul(arr3) = " + eksikSayiyiBul(arr3));

     // 2. yol  Arrays.sort(arr); array içini sıralayarak eksik olanı bulabiliriz

    }//main sonu

    private static int eksikSayiyiBul(int[] arr) {
        int arrtoplam = 0;

        for (int i = 0; i < arr.length; i++) {

            arrtoplam += arr[i];
        }

        return 55 - arrtoplam;
    }


}//class sonu


package ch12_Arrays;

import java.util.Arrays;

public class C02_Arrys {
    public static void main(String[] args) {
//Array elemanı varlığını  kontrol etme...
//istenen sayiyi arrayda varmi yokmu kontrol ediniz

        int [] numbers= {12,13,55,66,35,3,4,34,33,63,72};

        int istenenSayi = 35;
int count = 0;
boolean flag = false;
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]==istenenSayi){
                count++;
                flag = true;
                break;
            }

        }
//count mantıgı ile bulma

        if (count>=1){
            System.out.println("senin sayı bizde var  " +istenenSayi);
        }else System.out.println("yoktur senin sayı bizde");
        //flag mantığı ile kontrol

        if (flag) {//flag true ise calışır
            System.out.println("senin istediğin sayı bizim array de var" + istenenSayi);
        }else System.out.println("senin sayı bizim array de yoktur");


        Arrays.sort(numbers);
        System.out.println("numbers = " + Arrays.toString(numbers));//
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));


        Arrays.binarySearch(numbers,istenenSayi);//undrefıne




    }
}

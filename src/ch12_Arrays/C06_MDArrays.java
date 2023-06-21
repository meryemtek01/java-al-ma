package ch12_Arrays;

import java.util.Arrays;

public class C06_MDArrays {
    public static void main(String[] args) {
/*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
       *  icerdeki  array'lere  inner->Daire array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */
//MD array tanımlama
        int[] arra=new int[3];
        int [][] arr1=new int[3][5];     //3 satır ve her satırda 5 sutun olacak
         //3 katlı bina ve her katında 5 daire olacak
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.deepToString(arr1));
        int[][][] arr2 = new int[2][3][5];
        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));
   //Task //Arrays.deepToString(arr2) = [[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]], [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]]
        int sinif24 [] [] =new int[3][24];
        int sinif21 [] [] =new int[5][21];
   //MD array eleman ekleme
        arr1[0][3]=35;//0. kat 3.daireye 35 ekledik
        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));
//Arrays.deepToString(arr1) = [[0, 0, 0, 35, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
   //task artadıgınızda 35 degerini prınt ediniz
        System.out.println("arr1[0][3] = " + arr1[0][3]);//arr1[0][3] = 35
   //manuel olarak MD array oluşturma
        int [][]mdArr={
                {1,2,3},//0.kat //inner arrays
                {10,20},//1. kat //inner arrays
                {103}};//2.kat //inner arrays
        System.out.println("mdArr.length = " + mdArr.length);//mdArr.length = 3
        // outer arraydeki son arrayin son elemanını

        System.out.println("mdArr[mdArr.length-1][0] = " + mdArr[mdArr.length - 1][0]);
        System.out.println("mdArr[mdArr.length - 1]  [mdArr [mdArr.length - 1].length - 1] = " + mdArr[mdArr.length - 1][mdArr[mdArr.length - 1].length - 1]);
        System.out.println("mdArr[1] = " + mdArr[1]);//mdArr[1] = [I@6b2fad11
        System.out.println("Arrays.toString(mdArr[1]) = " + Arrays.toString(mdArr[1]));//Arrays.toString(mdArr[1]) = [10, 20]
       // System.out.println("Arrays.deepToString(mdArr[1]) = " + Arrays.deepToString(mdArr[1]));
    }


}

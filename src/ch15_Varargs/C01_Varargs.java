package ch15_Varargs;


import java.util.Arrays;

public class C01_Varargs {
    public static void main(String[] args) {
/*
      VARARGS :dillerdeki  yuklem gelmemisse veya daha ornek cogaltilacaksa kullanildigi gibi javada da ayni sekilde kullanilir
      var----variety cesitlilik args---arguments
      SYNTAX ->
      mathodName(parametre1,parametre2, dataType... dataName) {
      method body....

      }

       1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır
       .
    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :


         Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
         ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

*/
        int sayi1 = 99;
        int sayi2 = 15;
        int sayi3 = 55;
        int sayi4 = 35;

        topla1(sayi1, sayi2);
        topla1(sayi3, sayi4);

        topla1(sayi1, sayi2, sayi3);

        System.out.println("**** varargs ile ****");
        toplavarargs(sayi1, sayi2, sayi3, 33);
        toplavarargs(sayi1, sayi2, sayi3, 33, 35);
        toplavarargs(sayi1, sayi2, sayi3, 33, sayi3, sayi2, 22);

        // Task -> verilen String'lerin en fazla karaktere sahip olanı print eden
// METHOD create ediniz->>
// parametre saysı belirli değil : varargs
        String str1="Java";
        String str2="Python";
        String str3="C++";
        String str4="JavaScript";
        enfazlaString(str1,str2);
        enfazlaString(str1,str2,str3);
        enfazlaString(str1,str4,str3,str2);

    }





    private static void enfazlaString(String ...str) {
        String enfazlakarakterli="";
        for (String w:str) {
            if (w.length() > enfazlakarakterli.length()) {
                enfazlakarakterli = w;
            }
        }
        System.out.println("enfazlakarakterli = " + enfazlakarakterli);
    }
    //   private static void toplavarargs(int ...i,String) {//varargs parameter must be the last parameter
    // }
    private static void toplavarargs(int... i) {
      //  System.out.println("i = " + i);//Implicit call to 'toString()' on array 'i'i = [I@21bcffb5
        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));//Arrays.toString(i) = [99, 15, 55]
        int toplam = 0;
        for (int w : i) {
            toplam += w;

        }
        System.out.println("varargs ile sayıların toplamı = " + toplam);
    }


    private static void topla1(int s, int ss, int sss) {
        System.out.println("üc sayının toplamı = " + (s + ss + sss));

    }

    private static void topla1(int s, int d) {
        System.out.println("(s+d) = " + (s + d));

    }
}

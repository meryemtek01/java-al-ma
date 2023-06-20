package ch12_Arrays;

import java.util.Arrays;

public class C03_Array {
    public static void main(String[] args) {

        String str = " tam oturması için birkaç ornek daha gerekir";
        String[] yeniArr = str.trim().split(" ");

        System.out.println("str= " + str);
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        System.out.println("yeniArr.length = " + yeniArr.length);

        //task str objesinde kactane karakter sayısını kullanılmış print ettiriniz
        System.out.println("str.length() = " + str.length());

        //task str objesinde kactane harf kullanılmıştır
        String bosluksuz = str.replaceAll("\\s", "");

        System.out.println("bosluksuz = " + bosluksuz);

        String [] arrBosluksuz=bosluksuz.split(" ");

        System.out.println("Arrays.toString(arrBosluksuz) = " + Arrays.toString(arrBosluksuz));

        System.out.println("bosluksuz.split(\" \").length = " + bosluksuz.split(" ").length);


    }


    }




package ch12_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        int[] sayi2 = {84, 72, 63, 3, 39};
        int[] yeniArr = Arrays.copyOf(sayi2, 15);
        System.out.println("Arrays.toString(sayi2) = " + Arrays.toString(sayi2));
      //  Arrays.fill(2,7,0);



    }



}


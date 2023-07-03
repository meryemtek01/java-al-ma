package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>(Arrays.asList(1,2,36,9,56,77));

        System.out.println("listNumber = " + listNumber);//listNumber = [1, 2, 36, 9, 56, 77]


        System.out.println("Collections.replaceAll(listNumber,1,111) = " +
                Collections.replaceAll(listNumber, 1, 111));//Collections.replaceAll(listNumber,1,111) = true

        System.out.println("listNumber = " + listNumber);//listNumber = [111, 2, 36, 9, 56, 77]


        Collections.fill(listNumber,33);
        System.out.println("listNumber = " + listNumber);//listNumber = [33, 33, 33, 33, 33, 33]


    }
}

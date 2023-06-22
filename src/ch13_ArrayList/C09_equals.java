package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {
    public static void main(String[] args) {

        ArrayList<String> list1= new ArrayList<>(Arrays.asList("a", "b"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "b"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("a", "b"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("b", "a"));

        System.out.println("list1.equals(list2) = " + list1.equals(list2));
        System.out.println("list1.equals(list3) = " + list1.equals(list3));
        System.out.println("list1.equals(list4) = " + list1.equals(list4));
    }
}

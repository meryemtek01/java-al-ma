package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> names = new ArrayList<>(List.of("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> nameA = new ArrayList< >();
        for (String i : names) {
            if (names.get(Integer.parseInt(i)).toLowerCase().contains("a")) {
                nameA.add(names.get(Integer.parseInt(i)));



        }
        }

    }
}

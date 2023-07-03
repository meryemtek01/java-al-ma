package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Ali", "Veli", "Ayse", "Fatma", "Omer"));//names = [Ali, Veli, Ayse, Fatma, Omer]
        System.out.println("names = " + names);
        ArrayList<String> newnames = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (!names.get(i).toLowerCase().contains("a")) {//a harfi olmayanları alır
                newnames.add(names.get(i));//a harfi olmayan her elemanı newname ekler
            }
        }
        System.out.println("newnames = " + newnames);//newnames = [Veli, Omer]
        names.clear();
        System.out.println("names = " + names);//names = []

        names.addAll(newnames);
        System.out.println("names = " + names);//names = [Veli, Omer]

    }
}

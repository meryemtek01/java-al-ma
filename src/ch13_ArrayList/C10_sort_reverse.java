package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_sort_reverse {
    public static void main(String[] args) {
        //Collections.sort(list);-> verilen list'i naturel sıralama return eder..
//Collections.reverse(list);-> verilen listin ters sıralamasını return eder index nolarina gore
        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);//country = [Madaskar, Almanya, Polonya, İtalya]

        Collections.sort(country);
        System.out.println("country = " + country);//country = [Almanya, Madaskar, Polonya, İtalya]

        Collections.reverse(country);
        System.out.println("country = " + country);//country = [İtalya, Polonya, Madaskar, Almanya]



    }
}

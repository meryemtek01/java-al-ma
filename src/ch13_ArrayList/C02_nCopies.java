package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(List.of("madaskar", "almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "Bursa", "Aydın"));
        System.out.println("city = " + city);


        ArrayList<String> yeniList=new ArrayList<>(Collections.nCopies(7,"NEV ZEALAND"));
        System.out.println("yeniList = " + yeniList);

//AddAll methodu iki
       city.addAll(country);
       System.out.println("city = " + city);
       city.addAll(1,country);
        System.out.println("city = " + city);

    }
}

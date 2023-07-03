package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);
        Collections.sort(country);
        System.out.println("country.remove(\"UGANDA\") = " + country.remove("UGANDA"));
        System.out.println("country.remove(\"Norway\") = " + country.remove("Norway"));
        System.out.println("country.remove(0) = " + country.remove(0));
        System.out.println("country = " + country);
        country.add("Amerika");
        country.add("Hollanda");
        country.add("Ukrayna");
        country.add("Amerika");
        System.out.println("country = " + country);
        System.out.println("country.remove(\"Amerika\") = " + country.remove("Amerika"));//ilk giren ilk çıkar
        System.out.println("country = " + country);

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "Bursa", "Aydın"));
        System.out.println("city = " + city);
        country.addAll(city);
        System.out.println("country = " + country);

        System.out.println("country.removeAll(city) = " + country.removeAll(city));
        System.out.println("city = " + city);
        System.out.println("country = " + country);


    }
}

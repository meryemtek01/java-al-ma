package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_İndexOf {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "Bursa", "Aydın"));
        System.out.println("city = " + city);

        System.out.println("city.indexOf(\"Samsun\") = " + city.indexOf("Samsun"));
        System.out.println("city.indexOf(\"ankara\") = " + city.indexOf("Ankara"));

        country.add("İngiltere");
        System.out.println("country.indexOf(\"İngiltere\") = " + country.indexOf("İngiltere"));
        System.out.println("country.lastIndexOf(\"İngiltere\") = " + country.lastIndexOf("İngiltere"));

        country.add("Almanya");
        System.out.println("country.indexOf(\"Almanya\") = " + country.indexOf("Almanya"));
        System.out.println("country.lastIndexOf(\"Almanya\") = " + country.lastIndexOf("Almanya"));
        System.out.println("country = " + country);



    }
}

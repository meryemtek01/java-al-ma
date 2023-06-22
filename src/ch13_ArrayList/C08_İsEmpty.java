package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_İsEmpty {
    //isEmpty();-> listin boş olmasını kontrol eder true/false return eder.
//clear(); -> listin tum elelmalrını siler
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);

        System.out.println("country.isEmpty() = " + country.isEmpty());
//country.isEmpty() = false
        country.clear();
        System.out.println("country = " + country);

        System.out.println("country.isEmpty() = " + country.isEmpty());

    }
}

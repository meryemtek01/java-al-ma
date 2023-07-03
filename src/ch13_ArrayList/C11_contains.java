package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);//country = [Madaskar, Almanya, Polonya, İtalya]
        System.out.println("country.contains(\"ALMANYA\") = " + country.contains("ALMANYA"));


    }
}

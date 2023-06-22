package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);

        System.out.println("country.size() = " + country.size());//esnek yapı



    }
}

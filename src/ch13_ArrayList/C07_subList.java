package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());//country.size() = 4
        System.out.println("country.subList(3,4) = " + country.subList(3,4));
//yeni list oluşturup eski listeden eleman çekme

        ArrayList<String> yeniList = new ArrayList<>(country.subList(2,4));
        System.out.println("yeniList = " + yeniList);
     //RTE   System.out.println("country.subList(2,5) = " + country.subList(2, 5));

    }
}

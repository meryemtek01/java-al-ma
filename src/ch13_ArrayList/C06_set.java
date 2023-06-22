package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
        //crud update işlemi için kullanılır
        ArrayList<String> country = new ArrayList<>(List.of("Madaskar", "Almanya", "Polonya", "İtalya"));
        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());//country.size() = 4


        System.out.println("country.set(0,\"Amerika\") = " + country.set(0, "Amerika"));//country.set(0,"Amerika") = Madaskar


        System.out.println("country = " + country);//country = [Amerika, Almanya, Polonya, İtalya]


        System.out.println("country.size() = " + country.size());//country.size() = 4


    }
}

package ch14_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_forEachtloop {
    public static void main(String[] args) {
        // task-> iki string array eleamanlarının ortak olmasını kontrol eden varsa
// ortaklari yazdirancode create ediniz.. with for-each
        String [] arr1 = {"zerrin" , "fatih" ,"mustafa" ,"zeynep","iclal" ,"musa" , "kasim" ,"john"};
        String [] arr2 = {"christina" , "bale" ,"mustafa" ,"zeynep","iclal" ,"moossa" , "reese" ,"angel"};



        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str1.equals(str2)) {
                    System.out.println("Ortak eleman: " + str1);
                }

            }
        }

        System.out.println("zafer hocanın çalışması");
        List<String> ortak = new ArrayList<String>();

        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str1.equals(str2)) {
                    ortak.add(str1);
                }

            }
        }
        if (ortak.isEmpty()) {
            System.out.println("ortakisim yok " + ortak);
        }else System.out.println("ortak = " + ortak);

    }


}

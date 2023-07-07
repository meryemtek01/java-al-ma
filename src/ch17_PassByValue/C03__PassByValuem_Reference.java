package ch17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03__PassByValuem_Reference {

    public static void main(String[] args) {
       /*
java non-primitive(Class array list-> refrans ) data turlerinde obj
kendisi değil de dataları geğişirse
obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
 */

// Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
//      update yapan print eden code create ediniz.
//1. method-> with for each   2. method-> set(index,value)


        List<Integer> list = new ArrayList<>(Arrays.asList(24,20,87));

        System.out.println("operasyon öncesi list="+list);//operasyon öncesi list=[24, 20, 87]

        listUpdate1(list);//list update1 methodu içinden list = [24, 20, 87]
        System.out.println(" listUpdate1(list) methodu çalıştı ");

        listUpdate2(list);//list update2 methodu içinden list = [48, 40, 174]
        System.out.println(" listUpdate2(list) methodu çalıştı ");

        System.out.println("operasyon sonrası list="+list);//operasyon sonrası list=[48, 40, 174]

    }//main sonu

    private static void listUpdate2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);// set le değişikliği kalıcılı yapıyor
        }
        System.out.println("list update2 methodu içinden list = " + list);//list update2 methodu içinden list = [48, 40, 174]
    }

    private static void listUpdate1(List<Integer> list) {
        for (Integer w:list) {
            w+=2;

        }
        System.out.println("list update1 methodu içinden list = " + list);//list update1 methodu içinden list = [24, 20, 87]
    }


}

package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_listConvertIoArry {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "Erzurum", "Bursa", "Aydın"));
        System.out.println("city = " + city);//city = [Ankara, Erzurum, Bursa, Aydın]
        //1. yol donene object class a atanırsa
        Object[] arrcity = city.toArray();//parametsiz
        System.out.println("Arrays.toString(arrcity) = " + Arrays.toString(arrcity));
        //Arrays.toString(arrcity) = [Ankara, Erzurum, Bursa, Aydın]
        //2. yol bir listi arrye çevirmiş olduk
        String[] arrcity2 = city.toArray(new String[0]);//parametreli
        System.out.println("Arrays.toString(arrcity2) = " + Arrays.toString(arrcity2));
        //Arrays.toString(arrcity2) = [Ankara, Erzurum, Bursa, Aydın]

    }
}

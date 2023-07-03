package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C15_Arrayconverttolist  {
    public static void main(String[] args) {

        String[] names = {"Ali", "Zeynep", "Fatih", "Safak", "Derya"};
        System.out.println("names = " + Arrays.toString(names));//names = [Ali, Zeynep, Fatih, Safak, Derya]

        List<String> namelist = Arrays.asList(names);
        System.out.println("namelist = " + namelist);//namelist = [Ali, Zeynep, Fatih, Safak, Derya]
      //RTE  System.out.println("namelist.add(\"Zafer\") = " + namelist.add("Zafer"));
        // Exception in thread "main" java.lang.UnsupportedOperationException

        ArrayList<String> nameArryList = (ArrayList<String>) Arrays.asList(names);
       //RTE System.out.println("nameArryList = " + nameArryList);
        //Exception in thread "main" java.lang.ClassCastException: class java.util.Arrays$ArrayList cannot be cast to class java.util.ArrayList (java.util.Arrays$ArrayList and java.util.ArrayList are in module java.base of loader 'bootstrap')

        ArrayList<String> namelistArryList = new ArrayList<>(Arrays.asList(names));
        System.out.println("nameArryList = " + nameArryList);

        Collections.sort(namelistArryList);
        System.out.println("nameArryList = " + nameArryList);


    }
}

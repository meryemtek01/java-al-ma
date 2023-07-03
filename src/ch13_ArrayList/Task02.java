package ch13_ArrayList;

import java.util.ArrayList;

public class Task02 {
    /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
    public static void main(String[] args) {
        String[][] mdArry = new String[][]{{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        arrayconvertToList(mdArry);


    }

    private static ArrayList<String> arrayconvertToList(String[][] str) {
        ArrayList<String> namelist = new ArrayList<String>();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                namelist.add(str[i][j]);
            }
        }
        System.out.println("namelist = " + namelist);//namelist = [Ali, Veli, Ayse, Hasan, Can, Suzan]
        namelist.add("Zafer");
        System.out.println("namelist = " + namelist);//namelist = [Ali, Veli, Ayse, Hasan, Can, Suzan, Zafer]


        return namelist;
    }
}

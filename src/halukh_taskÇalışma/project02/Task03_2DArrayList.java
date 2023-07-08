package halukh_taskÇalışma.project02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task03_2DArrayList {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {


       ArrayList<String> calisanlar = new ArrayList<>(Arrays.asList("Zeynep", "Esra", "Azra"));
        ArrayList<String> isverenler = new ArrayList<>(Arrays.asList("Haluk", "Elly", "Mahmut hoca"));
        ArrayList<String> sirketler = new ArrayList<>(Arrays.asList("Clarusway","şirketi hayriye"," Microsoft"));
        ArrayList<ArrayList<String>> listeler = new ArrayList<>(Arrays.asList(calisanlar, isverenler, sirketler));

        System.out.println("calisanlar = " + calisanlar);
        System.out.println("isverenler = " + isverenler);
        System.out.println("sirketler = " + sirketler);
        System.out.println("listeler = " + listeler);

      /*  listDepo.add(calisanlar);
        listDepo.add(isverenler);
        listDepo.add(sirketler);

        for (List<String> w : listDepo) {
            for (String x : w) {
                System.out.print(x + " ");
            }
            System.out.println();
        }*/

    }

    }



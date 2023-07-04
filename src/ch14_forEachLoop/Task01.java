package ch14_forEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
*/
        List<Integer> notlar = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String devamMi;


        do {
            System.out.print("istedigin kadar Öğrenci notlarını girin : ");
            int not = input.nextInt();

            System.out.print("devam edecekmisin? devam için E  devam etmek istemiyorsn H basınız ");
            devamMi = input.next();
            notlar.add(not);


        } while (devamMi.equalsIgnoreCase("E"));

        Collections.sort(notlar);
        System.out.println("notlar = " + notlar);
        //ortalama üstü olan notlar

        int notlartop=0;
        for(int w:notlar){
            notlartop+=w;
        }
        double otalama=notlartop/notlar.size();
        System.out.println("orlama = " + otalama);

        int ortalamaGecen=0;
        for (int each:notlar){
            if (each>otalama){
                ortalamaGecen++;
                System.out.println("each = " + each);
            }
        } System.out.println();
        System.out.println("ortalamaGecen = " + ortalamaGecen);

    }

}

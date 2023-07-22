package halukh_taskÇalışma.InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q33_CollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 br saga kaydir ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        ArrayList<Integer> sayiListe=new ArrayList<Integer>();
        for (int i = 0; i <5 ; i++) {
            System.out.print("agam "+ i+"  sayınını giriniz");
            sayiListe.add(input.nextInt());

        }
        System.out.println("listenin ilk hali "+sayiListe);
//listeyi ters
        Collections.reverse(sayiListe);
        System.out.println("ters sıralı hali  "+sayiListe);

        Collections.shuffle(sayiListe);//rast gele random yapr krıştırı
        System.out.println("karışık sıralı hali  "+sayiListe);
       // 3 br saga kaydir ve yazdır
        Collections.rotate(sayiListe,3);

        System.out.println("3 br saga kaydir ve yazdır "+sayiListe);

        // part 2: find the max number and min number, print them
        // replace all max number with min number
        System.out.println(" list max eleman "+Collections.max(sayiListe));
        System.out.println(" list min eleman "+Collections.min(sayiListe));
        // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
        // tüm maksimum sayıları minimum sayı ile değiştir
       Collections.replaceAll(sayiListe, Collections.max(sayiListe), Collections.min(sayiListe));
        System.out.println(" max mim ile değiştikten sonra"+sayiListe);
    }



}

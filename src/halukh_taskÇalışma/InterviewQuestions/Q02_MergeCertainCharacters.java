package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam bişeyler ciziktiresen : ");
        String bişeyler = input.nextLine();
        System.out.println("Agam tekrar sayısı giresen : ");
        int sayi = input.nextInt();
        System.out.println(mergeCertainCharacters(bişeyler, sayi));

    }//main sonu
    private static String  mergeCertainCharacters(String str, int tekrarSayisi) {

        String output="";
        for (int i = 1; i <= tekrarSayisi; i++) {
            output+= str.substring(0,1)+str.substring(str.length() - 1);
        }

        return output;
    }


}//class sonu






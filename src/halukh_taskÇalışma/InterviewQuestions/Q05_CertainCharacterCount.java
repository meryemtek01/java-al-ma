package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Task->
     * Girilen  bir cumle ve bir harf için
     * Cumlede harfin kac kere
     * kullanildigini print eden code create ediniz.
     *  ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle=input.nextLine().toLowerCase();

        System.out.print("Harf: ");
        char harf = input.next().charAt(0);

        int count=0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==harf){
                count++;

            }

        }

        System.out.println("agam "+ cumle+" "+ count+" kadar var");

    }
}

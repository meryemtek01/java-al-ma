package halukh_taskÇalışma.Challange06;

import java.util.Scanner;

public class Task09_HarfSay {
    /* Task->
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static <string> void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bir cumle giriniz ");
        String cumle=input.nextLine();
        System.out.println("aranan harfi giriniz");
        char harf=input.next().charAt(0);

        int harfadeti=0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==harf){
                harfadeti++;
            }
        }
        System.out.println(harf+ "  harfi adeti  "+harfadeti);

    }


}

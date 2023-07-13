package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q24_CountsOfRepeatingElement {
    /*  Task->
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
            Verilen arrayde istenen sayının tekrar saysını print eden code create ediniz.
     */

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,6,9,-4,5,-2,0,2,0};
        Scanner input=new Scanner(System.in);
        System.out.println("bizim oglan bir sayı giriniz");

        int sayi=input.nextInt();
        int tekraraSayisi=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==sayi) tekraraSayisi++;

        }
        System.out.println("istenen sayi : "+sayi+" arrayda "+tekraraSayisi+" kadar kullanıldı");
    }
}

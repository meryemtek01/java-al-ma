package ch10_MethodCreation;

import java.util.Scanner;

public class C07_Palindrone {
    public static void main(String[] args) {
        /*
girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
plindrome:her iki yönde okundugunda eşit olan ifadeler
madam , ada ,iki asa, 121
 */
        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz ");
        String kelime = input.nextLine().toLowerCase();
        palindrone(kelime);

    }

    private static void palindrone(String k) {
        String ters = "";//boş konteyner olusturuldu

        for (int i = k.length() - 1; i >= 0; i--) {//kelime tersten alıkndı
            ters += k.charAt(i);//tersten herbir karakter atandı
        }
        System.out.println("girdigin kelimenin tersi " + ters);
        if (ters.equals(k)) {//equalsIgnoreCase de olabilir

            System.out.println("bu kelime palindrome  olur ");

        } else System.out.println("kelime palindrome degildir ");



    }
}

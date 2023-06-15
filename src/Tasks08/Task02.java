package Tasks08;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("bir metin  giriniz : ");
        String str = sc.nextLine();
        String tersStr = "";//bos bir String kutu kulah

        for (int i = str.length() - 1; i >= 0; i--) {

            tersStr += str.charAt(i);//strnin i.Ci karakterini tersStr'ye ekler(concat)
        }
        System.out.println("girilen ifadenin tersi :" + tersStr);

        if (str.equalsIgnoreCase(tersStr)) {//str ile tersSTr eşitlik kontrolu
            System.out.println("girilen ifade POLİNDROME ");

        } else System.out.println("girlen ifade polindrome değil");

    }


}

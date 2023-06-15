package tasks03;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("sevdiginiz meyveyi giriniz");
        String meyve = input.nextLine();
        System.out.println("sevfigini meyve  " + meyve);
       char ilkharf = meyve.charAt(0);
        System.out.println("ilk harf:  "+ilkharf);
        System.out.println("meyve.length() "+meyve.length());
        char sonharf = meyve.charAt(meyve.length() - 1);
        System.out.println("son harf: "+sonharf);
        System.out.println("meyve.equals() = " + meyve.equals('e'));
    }
}

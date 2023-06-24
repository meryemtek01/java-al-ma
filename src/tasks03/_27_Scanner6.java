package tasks03;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    Bir string oluşturunuz.
          Doğum gününüzü konsola giriniz.
          String'i yazdırınız.  */

        //kodu aşağıya yazınız.
        Scanner input =new Scanner(System.in);
        System.out.println("bir cumle giriniz");

        String line = input.nextLine();
        System.out.println("line = " + line);
        System.out.println("line.equals(\"doğum günüzü giriniz\") = " + line.equals("d"));
        System.out.println("line.toUpperCase() = " + line.toUpperCase());
        System.out.println("line.toLowerCase() = " + line.toLowerCase());
      //  System.out.println("line.substring(2, line.length()) = " + line.substring(3, line.length());
       // System.out.println("line.replace() = " + line.replace(line.length(0),"A")));
    }
}

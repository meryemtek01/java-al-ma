package tasks03;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */

        //Kodu aşağıya  yazınız.

        Scanner input = new Scanner(System.in);//1. adim

        System.out.println("adınızı giriniz:");
        String name = input.nextLine();
        System.out.println("isminizi: " + name);
        Scanner oku = new Scanner(System.in);//1. adim
        System.out.println("soyadınızı giriniz ");
        String name1 = oku.nextLine();
        System.out.println("adınız soyadınız :"+name+" "+name1);


    }
}

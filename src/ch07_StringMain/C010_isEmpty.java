package ch07_StringMain;

import java.util.Scanner;

public class C010_isEmpty {
    public static void main(String[] args) {

        String hi = "hello";
        System.out.println("hi.isEmpty() " + hi.isEmpty());//hi.isEmpty() false

        //Task->  2: Girilen  isim mutlaka space'den farkli en az 1 character icermediğini kontrol eden code
        // create ediniz

        //Task->  2 : kullanici isim girsin. siz kullancinin isim girip girmedigi kontrol edin
        //isim girdiyse devam etsin girmediyse yeniden denesin
        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String name = input.nextLine();

        if (name.isEmpty()) {// boşluk kabul ediyor

            System.out.println("isminizi girmeden ilerleyemezsiniz  ");

        } else
            System.out.println("hoş geldiniz " + name);

        if (name.isBlank()) {//boşluk kabul etmez

            System.out.println("isminizi girmeden ilerleyemezsiniz blank ile ");

        } else
            System.out.println("hoş geldiniz " + name);
    }
}

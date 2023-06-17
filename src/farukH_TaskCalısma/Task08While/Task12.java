package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
	//	do-While loop
		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str = input.nextLine().toLowerCase();//girilen str değeri kuck harfe atandı
        // Cozum while
        int harfSayisi          = 0;
        int rakamSayisi         = 0;
        int ozelKarekterSayisi  = 0;
        int index=0;
        while (str.length()>index) {
            if (Character.isDigit(str.charAt(index))) rakamSayisi++;
            else if (Character.isAlphabetic(str.charAt(index))) harfSayisi++;
            else ozelKarekterSayisi++;
            index++;

        }

        System.out.println("rakamSayisi = " + rakamSayisi);
        System.out.println("harfSayisi = " + harfSayisi);
        System.out.println("ozelKarekterSayisi = " + ozelKarekterSayisi);
        System.out.println();

        // çözüm for
        harfSayisi          = 0;
        rakamSayisi         = 0;
        ozelKarekterSayisi  = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))) rakamSayisi++;
            else if (Character.isAlphabetic(str.charAt(i))) harfSayisi++;
            else ozelKarekterSayisi++;
        }
        System.out.println("rakamSayisi = " + rakamSayisi);
        System.out.println("harfSayisi = " + harfSayisi);
        System.out.println("ozelKarekterSayisi = " + ozelKarekterSayisi);
        System.out.println();
        // Çözüm do while
        harfSayisi          = 0;
        rakamSayisi         = 0;
        ozelKarekterSayisi  = 0;
        index               = 0;
        do {
            if (str.length() == 0) {//"" boş karakterli str giriş şartı
                System.out.println("Agam adam gibi metim gir dedik ");
            } else if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {//str'nin idex'indeki karakterin harf olma şartı
                harfSayisi++;
            } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {//str'nin idex'indeki karakterin rakam olma şartı
                rakamSayisi++;
            }else ozelKarekterSayisi++;//str'nin idex'indeki karakterin özelkarakter olma şartı

            index++;
        } while (index<str.length());

        System.out.println("rakamSayisi = " + rakamSayisi);
        System.out.println("harfSayisi = " + harfSayisi);
        System.out.println("ozelKarekterSayisi = " + ozelKarekterSayisi);

    }
}

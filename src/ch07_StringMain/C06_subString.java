package ch07_StringMain;

import java.util.Scanner;

public class C06_subString {
    public static void main(String[] args) {
/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder

substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
   String str="çalıştıkca daha çok şey bilmediğimi farkediyorum"   ;
        System.out.println("(str.substring(0, 4) "+str.substring(0, 5));//(str.substring(0, 4) çalış
//ilk girilen parametre dahidir ikinci parametre dahil edilmez
        System.out.println("str.substring(10) "+str.substring(10));//str.substring(10)  daha çok şey bilmediğimi farkediyorum
          int sononikikarakterindex= str.length()-12;
        System.out.println("str.charAt(sonikikarakteriındex)  "+str.charAt(sononikikarakterindex));//str.charAt(sonikikarakteriındex)  f

        System.out.println("str.startsWith(sonikikarakterindex) "+str.startsWith(String.valueOf(sononikikarakterindex)));//str.startsWith(sonikikarakterindex) false


        //TASK str datasının ilk 10 (on dahil) karakterini print ediniz..(sonuc olark ilk 10 karakterin hepsi
        System.out.println("str.startsWith(10) = " + str.substring(0,10));//str.startsWith(10) = çalıştıkca


        //task
        System.out.println("str.substring(0, 1) "+str.substring(0, 1));//str.substring(0, 1) ç
    //Task girilen 4 harfli kelimeyi tersten yan yana print eden code create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String str5=input.next();

        if (str5.length() !=4) {
            System.out.println("yanlış kelime girdiniz");


        }else
            System.out.print(str5.substring(str5.length() - 1));//son karakter alındı
        System.out.print(str5.charAt(str5.length() - 2));//sondan 1. karakter alındı

        //        System.out.print(str5.substring((str5.length() - 3), (str5.length() - 2)));
        System.out.print(str5.substring((str5.length() - 3), (str5.length() - 2)));
//System.out.println(str5.substring(1, 2));
        System.out.println(str5.substring(0, 1));
    }
}

package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q27_AtbashCode {
    /*  Task->
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";

      Girilen bir str'nin AtbashCode print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birseyler giriniz");
        String metin=input.nextLine();//emine


        String str1="abcdefghijklmnopqrstuvwxyz";//26 karakter
        String str2="zyxwvutsrqponmlkjihgfedcba";
        for (int i = 0; i <metin.length() ; i++) {//metin karakterleri tekrara alındı
            for (int j = 0; j <26 ; j++) {//
                if (metin.charAt(i)==str1.charAt(i)){
                  // metin.charAt(i)=str2.charAt(j);
                    System.out.print(  str2.charAt(j));
                }

            }


        }



    }



}
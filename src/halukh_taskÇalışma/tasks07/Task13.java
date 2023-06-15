package halukh_taskÇalışma.tasks07;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String i yazınız : ");
        String str = scan.nextLine();

        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14
        System.out.println(str.replace(" ","").length());


        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.



        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.
        String str2 = str.replaceAll("a","A");
        System.out.println(str2);
        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz

        String str3 = str.replaceAll("kara","*");
        System.out.println(str3);
        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********

        String str4 = str.replaceAll("\\d","*");
        System.out.println(str4);



    }
}

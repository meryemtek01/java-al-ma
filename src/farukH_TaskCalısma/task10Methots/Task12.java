package farukH_TaskCalısma.task10Methots;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen e-mail ın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */
        emailControl1();
        System.out.println(" 1. method run oldu ");
        emailControl2("ebıkGabık@gmail.com");
        System.out.println(" 2. method run oldu ");
        System.out.println(emailControl3());
        System.out.println(" 3. method run oldu ");

    }//main sonu

    private static String emailControl3() {
        System.out.print("imeyıl  giriniz : ");
        String  email=input.nextLine();
      return   (email.contains("@") && email.contains(".") && email.charAt(0) != '@') ? "imeyıl BAŞARILI" : "bizimle DEĞILSIN";

    }

    private static void emailControl2(String email) {
        System.out.println((email.contains("@") && email.contains(".") && email.charAt(0) != '@') ? "email BAŞARILI" : "bizimle DEĞILSIN");
    }

    private static void emailControl1() {
        System.out.print("email  giriniz : ");
        String  email=input.nextLine();
        System.out.println((email.contains("@") && email.contains(".") && email.charAt(0) != '@') ? "email BAŞARILI" : "bizimle DEĞILSIN");
    }


}

package halukh_taskÇalışma.InterviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q39_UseContinue {

        /* Task->
         Girilen bir stringin harflerini bosluk veya a harfi teker teker  alt alta print eden code create ediniz.
         */


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birseyler giriniz");
        String metin=input.nextLine();//emine
        ArrayList<Character> output=new ArrayList<Character>();

        for (int i = 0; i <metin.length() ; i++) {

            if (metin.charAt(i)==' '|| metin.charAt(i)=='a') {//metin karakterlerin '' veya  olma şartı
                continue;// if bu döngü atlanacak

            }else System.out.print(metin.charAt(i));

        }

    }

}

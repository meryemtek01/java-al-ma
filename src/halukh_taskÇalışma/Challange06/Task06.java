package halukh_taskÇalışma.Challange06;

import java.util.Scanner;

public class Task06 {

    /*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" print eden code create ediniz
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //  System.out.println("bir sayı giresin");
        char c;
        do {
            System.out.println("bir sey giriniz");
            c = input.next().charAt(0);
            System.out.println("program çalışıyor");
        } while (c != 'x');
        System.out.println("Program bitti");


    }
}

package ch09_Break_Continue;

import java.util.Scanner;

public class C02_contınue {
    public static void main(String[] args) {
         /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa,
 ondan sonraki komutlara
atlar ve loop'un bir sonraki değerinden devam eder.

 */
        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("bir mail giriniz");
        String mail= input.nextLine();

        for (int i = 0; i <=mail.charAt(i)-1 ; i++) {
            if (mail.charAt(i)==' '){
                continue;

            }
            System.out.print( mail.charAt(i));

        }
        System.out.println("zafer bey yöntemi");
        for (int i = 0; i <=mail.charAt(i)-1 ; i++) {
            char ch=mail.charAt(i);
            if (ch==' '){
                continue;
            }
            System.out.println(ch);

        }


    }
}

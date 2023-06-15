package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
       /*
Task01
   girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı  giriniz:");
        int sayi= input.nextInt();
        if (sayi<0) {
            System.out.println("sayınız negatif");
        } else if (sayi>0) {
            System.out.println("sayınız pozitif");
        }  else {
            System.out.println("girdiginiz sayı sıfır");
        }
    }
}

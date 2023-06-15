package ch08_Loops.L02_WhileL00p.Tasks08_whileLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
Scanner input=new Scanner(System.in);
   //     System.out.println("sayı giriniz");

int sum=0;
int count=0;
while (sum<333) {
    System.out.println("sayı giriniz");
    int sayi = input.nextInt();
    sum += sayi;
    count++;
}
        System.out.println("girilen sayı adedi"+count);
        System.out.println("girilen sayıların toplamı: "+sum);

input.close();
    }

}

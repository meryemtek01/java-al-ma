package halukh_taskÇalışma.InterviewQuestions;


import java.util.Scanner;

public class Q20_PrintEvenNumber {
    /* Task->
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    Girilen sayını tek-çiftlğini return eden method create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("agam bir sayı giresin");
       int sayi = input.nextInt();

        System.out.println(tekCiftKontrol(sayi));
        System.out.println(  tekCiftKontrol1(sayi));;

    }

    private static String tekCiftKontrol1(int sayi) {
        return sayi%2==0?"sayı çift ":"sayı tek ";
    }

    private static boolean tekCiftKontrol(int sayi) {

        return sayi%2==0?true:false;
    }

}

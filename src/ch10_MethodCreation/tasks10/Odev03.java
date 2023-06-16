package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi= input.nextInt();

        getAsalMi(sayi);
    }//main sonu

    private static boolean getAsalMi(int num) {
        boolean result;
        if (num <= 1) {
            return false;
        }

      //  for (int i = 2; i <= Math.sqrt(num); i++) {
        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;



    }
}//class sonu

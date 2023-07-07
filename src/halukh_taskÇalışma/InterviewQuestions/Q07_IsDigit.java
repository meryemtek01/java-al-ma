package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q07_IsDigit {
      /* Task->
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     girilen bir stringdeki rakam değerlerinin toplamını return eden method create ediniz.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("bizim oglan birşeyler girecek mi: " );
        String bisey=input.nextLine();
        System.out.println("sumofdigit(bisey) = " + sumofdigit(bisey));

    }//main sonu

    private static int sumofdigit(String str) {

        int toplam=0;
        for (int i = 0; i <str.length() ; i++) {//J4\/4 1$ 34$¥
            if (Character.isDigit(str.charAt(i))) {
             //   toplam += Character.getNumericValue(Integer.valueOf(str.charAt(i)));


            }


        }


        return  toplam;
    }


}//class sonu

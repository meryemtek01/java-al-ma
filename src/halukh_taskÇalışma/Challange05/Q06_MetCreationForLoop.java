package halukh_taskÇalışma.Challange05;

import java.util.Scanner;

public class Q06_MetCreationForLoop {
    /* Interview Question
     Write a Java program to reverse a string.
     Use for loop and create a method called reverseString
     mülakat sorusu
     Bir diziyi tersine çeviren bir Java programı yazın.
     Döngü için kullanın ve reverseString adlı bir yöntem oluşturun
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir cumle giriniz");
        String cumle = input.next();
        int cumlesayi=cumle.length()-1;
        String tersstr="";
        for (int i = cumlesayi; i >=0; i--) {
            tersstr+=cumle.charAt(i);
            System.out.print(tersstr);
        }
       // for (int i = cumle.length()-1; i >=0; i--) {
          //  System.out.print( cumle.charAt(i));
      //  }


    }
}

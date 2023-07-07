package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q11_PerfectNumber {
    /* Task->
    Perfect Number (Mukemmel sayi)
      Girilen bir sayinın mukemmel olmasını kontrol eden method create ediniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bizim ooolannn bişeyleee girceng mi : ");

        int sayi = input.nextInt();

        System.out.println(perfectNumberControl(sayi));


    }//main sonu

    private static String perfectNumberControl(int sayi) {

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi ? "PERFECT NUMBER" : "unperfect number";

    }
}//Class sonu
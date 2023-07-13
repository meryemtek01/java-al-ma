package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q21_CountFactors {
    public static void main(String[] args) {
/* Task->
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Girilen sayının tam bolen sayısını print eden code create ediniz.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
        Scanner input=new Scanner(System.in);
        System.out.println("bizim oglan bir sayı giriniz");

        int sayi=input.nextInt();

        System.out.println("*** while ***");
        int bolensayi=0;
        int bolen=1;
        while (bolen<=sayi){//1,2,3.... tekrarı tanımlandı
            if (sayi%bolen==0) {//tekrarlardaki herbir sayını girilen

                bolensayi++;
                System.out.print(bolen+" ");
            }
                bolen++;
        }
        System.out.println();
        System.out.println(sayi+" nın "+ bolensayi+" tane tam boleni vardır ");
        System.out.println("*** for ***");
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0) {//tekrarlardaki herbir sayını girilen

                bolensayi++;
                System.out.print(i+" ");
            }


        }System.out.println(sayi+" nın "+ bolensayi+" tane tam boleni vardır ");



    }


}

package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q08_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("bizim oglan birşeyler girecek mi: " );
       int rakamKupToplam=0;

        int sayi=input.nextInt();
        int sayikoru=sayi;
       while (sayi>0){
        // rakamKupToplam=  (sayi%10*sayi%10*sayi%10);
         rakamKupToplam+=Math.pow(sayi%10,3);//sayıların kuplerini alır
         sayi/=10;

       }
       if (rakamKupToplam==sayikoru){
           System.out.println("bizimoglan sayi  "+sayikoru+"   AMSTRONG:)");
       }else            System.out.println("bizimoglan sayi  "+sayikoru+"   AMSTRONG feğil :(");





    }
}

package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q23_Using {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bizim oglan bir sayı giriniz");

        int sayi=input.nextInt();

        if (sayi<100){
            System.out.println("won  ");
        }else System.out.println("Lost");


    }
}

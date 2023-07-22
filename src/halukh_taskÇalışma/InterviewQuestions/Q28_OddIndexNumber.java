package halukh_taskÇalışma.InterviewQuestions;

import java.util.Scanner;

public class Q28_OddIndexNumber {
    // Task-> girilen str'deki indexi tek olan karakterleri pr,nt eden code create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birseyler giriniz");
        String metin=input.nextLine();//emine

        for (int i = 0; i <metin.length() ; i++) {

            if (i%2==1){
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println();
        System.out.println("********  Do while yapılımı  *******");
        int index=1;
        do {
            System.out.print(metin.charAt(index));
            index+=2;

        }while (index<metin.length());



    }
}
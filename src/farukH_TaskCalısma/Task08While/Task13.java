package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde ise
        "javaTAR" print eden code create ediniz. (javaTar yaz ve çık)
        do-while lopp
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str ="";
        do {
            System.out.println("javaCAN");
            System.out.print("? : ");
            str=input.nextLine();

        }while (!str.equalsIgnoreCase("x"));//x girmediği sürece :x girene kadar şartı
        System.out.println("javaTAR");

    }
}

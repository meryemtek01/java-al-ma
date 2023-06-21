package halukh_taskÇalışma.Challange07;

import java.util.Scanner;

public class Task07 {

    /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.  sayi giriniz");
        int sayi1=input.nextInt();

        System.out.println("2.  sayi giriniz");
        int sayi2=input.nextInt();
        System.out.println("esitcontroEt(sayi1, sayi2) = " + esitcontroEt(sayi1, sayi2));


    }

    private static String esitcontroEt(int sayi1, int sayi2) {
        return (sayi1==sayi2 ? "girilen sayılar eşit:)" : "girilen sayılar eşit değil:(");

    }
}





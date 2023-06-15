package ch10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // task-> girilen tam sayının rakamları toplamını print eden METHOD create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi=input.nextInt();

        System.out.println("rakamlartop(sayi) = " + rakamlartop(sayi));//method call edildi


    }//main sonu

    public static int rakamlartop(int x) {//method create edildi
        int rakamlartop = 0;
        while (x > 0) {// x 0 dan büyük oldugu mütdetce çalış
            rakamlartop += x % 10;//sayının son basamagı her seferinde 10 a bölüp kalanı toplanacak
            x /= 10;//her döngüde 10 bölünecek ve bir öncekibasamak atılmış olacak int sayesinde

        }
        return rakamlartop;

    }
}

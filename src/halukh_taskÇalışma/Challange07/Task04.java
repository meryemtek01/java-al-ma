package halukh_taskÇalışma.Challange07;

import java.util.Scanner;

public class Task04 {


    /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam bir tam sayı giriniz : ");
        int sayi = input.nextInt();
pozitifNegatifControl(sayi);//
        System.out.println("Task02.tekCiftControlEt1(sayi) = " + Task02.tekCiftControlEt1(sayi));
        // ucBasmakRakaTopla(sayi);
 //  yuzdenKckbirlerBasamagi(sayi);
        System.out.println( sayi>999 ? ucBasmakRakaTopla(sayi) : yuzdenKckbirlerBasamagi(sayi));

    }//main sonu

    private static int yuzdenKckbirlerBasamagi(int sayi) {
        return sayi%10;
    }

    private static int ucBasmakRakaTopla(int sayi) {
        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }
        return toplam;
        //  return( (sayi%10)+((sayi/10)%10)+(sayi/100));
    }

    private static int pozitifNegatifControl(int sayi) {
      System.out.println((sayi>0  && sayi!=0) ? "girilen sayi pozitif": "girilen sayı negatif");


        return sayi;
    }
}//class sonu
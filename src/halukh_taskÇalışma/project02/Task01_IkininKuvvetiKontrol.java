package halukh_taskÇalışma.project02;

import java.util.Scanner;

public class Task01_IkininKuvvetiKontrol {
    public static void main(String[] args) {
        /* Task
        Girilen sayının 2'nin kuvveti olmasının kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("pozitif tam sayi giriniz");
        int sayi = input.nextInt();
        input.nextInt();//15384587468648
        // System.out.println(powersofTwo(sayi));
        powersofTwo1(sayi);

    }//main sonu

    private static boolean powersofTwo(int sayi) {
        boolean sonuc = false;
        for (int i = 1; i <= sayi; i *= 2) {//1 2 4 8 16 32..
            if (sayi == i) {
                sonuc = true;
                break;
            }

        }

        return sonuc;

    }

    private static void powersofTwo1(int sayi) {
        if (sayi % 2 == 0) {// sayınıj 2 ye yam bolunme şartı
            sayi /= 2;//Sayı 2 ye bolundu 64->32
            if (sayi == 1) {//sayi surekli 2ye bolundugunde 1 olma şarı
                System.out.println("girilen sayi 2'nin kuvveti");
            } else {
                powersofTwo1(sayi);
            }

        } else {
            System.out.println("girilen sayı 2 'nin kuvveti değildir.");
        }

    }


//poversoftwo1(sayi);


    }//main sonu

  /*  private static void poversoftwo1(int sayi) {
        if (sayi %2==0){
            sayi/=2;
            if (sayi ==1){
                System.out.println("girilen sayı 2 nin kuvvetidir");
            }else {
                poversoftwo1(sayi);
            }

        }else {
            System.out.println("girilen sayı 2 nin kuvveti değildir");
        }


    }*/



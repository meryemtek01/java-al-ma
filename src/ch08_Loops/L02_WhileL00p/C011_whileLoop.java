package ch08_Loops.L02_WhileL00p;

import java.util.Scanner;

public class C011_whileLoop {
    public static void main(String[] args) {
        // task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz

     /*   int s = 11;
        while (s <= 100) {
            if (s % 2 == 1) {
                System.out.print(s + " ");

            }
            s++;
        }
        System.out.println("hocanın yaptıbı task3");
        int task3count = 11;
        while (task3count < 100){
            if (task3count % 2 == 1) {
                System.out.println(task3count + " ");

            }
            task3count++;
        }

        // task04-> girilen metni while loop ile  tersden print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String metin = input.nextLine();
        int uzunluk=metin.length()-1;
        while (uzunluk>=0){
            System.out.print(metin.charAt(uzunluk));
          uzunluk--;
        }
        System.out.println();
*/
        //task 5
        System.out.println("bir sayı giriniz");
        Scanner input=new Scanner(System.in);
        int sayi2=input.nextInt();
        int totel=0;
        while (sayi2>0){
            totel+=sayi2;
            sayi2--;
        }
        System.out.println("t0tal= "+totel);

        System.out.println();
        //task 6
        System.out.println("bir sayı giriniz");

        int sayi3=input.nextInt();
        int faktor=1;
        while (sayi3>0){
            faktor*=sayi3;
            sayi3--;
        }
        System.out.println(faktor);
    }

}

package Tasks08;

import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.
    //  harmoni seri  = 1 + 1/2 + 1/3 + 1/4 + ...
        Scanner scan = new Scanner(System.in);
        int sayi;

        System.out.print("n sayısını giriniz : ");
        sayi=scan.nextInt();


        double sonuc=0;
        for(int i=1; i<=sayi; i++){
            sonuc += (1.0/i);
        }
        System.out.println(sonuc);
        // cozum 2
        sonuc = 0;
        for(double i=1; i<=sayi; i++){
            sonuc += (1/i);
        }
        System.out.println(sonuc);
    }
}

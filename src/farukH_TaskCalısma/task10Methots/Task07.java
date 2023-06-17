package farukH_TaskCalısma.task10Methots;

import java.util.Scanner;

public class Task07 {


    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayi : "); int s1 = scanner.nextInt();
        System.out.print("2. sayi : "); int s2 = scanner.nextInt();
        System.out.print("3. sayi : "); int s3 = scanner.nextInt();
        int enBuyuk = enBuyukBul(s1,s2,s3);
        System.out.println("enBuyuk = " + enBuyuk);
        
        enBuyuk=fantaziCozum(s1,s2,s3);
        System.out.println("enBuyuk = " + enBuyuk);
    }//main sonu

    private static int fantaziCozum(int s1, int s2, int s3) {
        return Math.max(s1,buyuBul(s2,s3));
    }

    private static int buyuBul(int s2, int s3) {
        return Math.max(s2,s3);
    }

    private static int enBuyukBul(int s1, int s2, int s3) {
        return Math.max(s1,Math.max(s2,s3));
    }
    // 4 değer olsaydı
    // return Math.max(Math.max(s1,s2),Math.max(s3,s4));
    // 5 değer olsaydı
    // return Math.max(Math.max(s1,s2),Math.max(s3,Math.max(s4,s5)));
    


}

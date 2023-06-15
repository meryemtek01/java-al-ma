package Tasks08;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi1=input.nextInt();
        System.out.print("Bir sayı daha giriniz : ");
        int sayi2=input.nextInt();
//        int ust,alt;
//        ust = sayi1>sayi2 ? sayi1 : sayi2;
//        alt = sayi1<sayi2 ? sayi1 : sayi2;


        for (int i =(sayi1<sayi2 ? sayi1 : sayi2); i <=(sayi1>sayi2 ? sayi1 : sayi2) ; i++) {
            System.out.print(i%2==0 ? i+" " : "");
            }


        System.out.println();
        System.out.println("finish");
    }
}

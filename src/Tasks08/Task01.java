package Tasks08;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/
        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayi giriniz : ");
        int sayi = sc.nextInt();//63-> 1,2,3,  .. 63->


        if (sayi >= 100) {//girilen sayi 100 den kucuk olma sartı

            System.out.println("agam hani 100 den kuçuk girecktin :( ");
        } else {
            for (int i = 1; i < sayi; i++) {

                if
                (i % 3 == 0 && i % 5 == 0) {//girilen sayıya kadar 3 ve 5 e bölünme kontrolu
                    System.out.println("JavaCAN");

                } else if (i % 3 == 0) {//girilen sayıya kadar 3 e bölünme kontrolu
                    System.out.println("Java");

                } else if (i % 5 == 0) {//girilen sayıya kadar 5 e bölünme kontrolu
                    System.out.println("CAN'dır");

                } else System.out.println(i + " hicbir şartı sağlamayan sayi");


            }
        }

    }
}

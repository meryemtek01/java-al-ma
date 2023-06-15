package ch08_Loops;

import java.util.Scanner;

public class C02_forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir sayı giriniz");
        int sayı= input.nextInt();
        if (sayı<0){
            System.out.println("pozitif bir sayı girmelisiniz");
        }else
            for (int i = sayı; i <= 100 ; i++) {
                if (i%4 == 0) { //her bir i degeri 4 e tam bolunurse sartı
                    System.out.print(i+" ");
                }
            }
    }
}


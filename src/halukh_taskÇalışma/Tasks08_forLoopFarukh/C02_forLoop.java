package halukh_taskÇalışma.Tasks08_forLoopFarukh;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {

        // task -> girilen pozitif sayıdan 100 e kadar 4 un katı tamsayıları print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir tamsayi gir");
        int sayi = input.nextInt();

        if (sayi < 0 ){//girilen sayi negatif ise
            System.out.println("pozitif sayi girmelisin");
        }else {
            for (int i = sayi ; i <= 100  ; i++) {//i sayi dan baslar 100 e kadar artarak devam eder
                if (i % 4 ==0){//her bir i degeri 4 e tam bolunurse sarti
                    System.out.print(i +" ");
                }
            }
        }
    }
}

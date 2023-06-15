package ch08_Loops.L02_WhileL00p;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var

        System.out.println("bir sayı giriniz");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        int bolen=1;
        int tambolen=0;
        while (bolen<=sayi){
            if (sayi % bolen==0){
                tambolen++;
                System.out.print(bolen+" ");
            }
              bolen++  ;
        }

        System.out.println(sayi+" nın "+tambolen+"  böleni var ");



    }


}

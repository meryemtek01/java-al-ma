package halukh_taskÇalışma.Challange06;

import java.util.Scanner;

public class Task03_TekSayıAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz  ");
        int sayi= input.nextInt();
        int i=1;
        int teksayiadeti=0;//count sayaç
while (sayi>0){
    if (sayi%2==1){
        System.out.print(sayi+" ");
        teksayiadeti++;
    }
    sayi--;
}
        System.out.println("tek sayı adeti="+teksayiadeti);
    }

}

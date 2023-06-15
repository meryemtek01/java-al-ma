package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*
 TASK -> girilen bir ifadenin ilk karakterinin harf  olup olmadığını  kontrol eden code create ediniz..

*/
        Scanner input=new Scanner(System.in);
        System.out.println("bir ifade giriniz:");
        String ifade= input.next();
        char ilkkarakter=input.next().charAt(0); //girilen ifadenin ilk karakteri charAt(0) ile alınıp atandı
   if (ilkkarakter>='A' && ilkkarakter<='Z' || ilkkarakter>='a' && ilkkarakter<='z' ) {
       System.out.println("girdigin ifadenin  ilk karakterin harf tir="+ilkkarakter);
   }else
       System.out.println("girdigin ifadenin  ilk karakterin harfdeğildir="+ilkkarakter);

    }

}

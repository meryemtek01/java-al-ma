package halukh_taskÇalışma.Challange02;

import java.util.Scanner;

public class Task07_IfStatement {


       /*

		task->
		Kullanicinın  yas ve kilo bilgileri için
		18 yasindan kucuk ise kan bagisi yapamaz.
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		print eden code create ediniz.

		 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aslanım  hele bir yasını gir baken : ");
        int aslanYası = input.nextInt();

       // System.out.println("Aslanım  hele bir kilonu gir baken : ");
       // int aslanKilosu = input.nextInt();
        if (aslanYası>=18) {//genel şart kontrolu
            System.out.println("Aslanım  hele bir kilonu gir baken : ");
            int aslanKilosu = input.nextInt();
            if (aslanKilosu>0 &&aslanKilosu <50) {//özel şart
                System.out.println("kan bağışı yapamaz :( ");
            }else System.out.println("Kan bağışı yapabilir :) ");

        }else System.out.println("yasınız 18 den küçük kan bağışı yapamazsınız");



    }
}


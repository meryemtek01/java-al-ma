package halukh_taskÇalışma.Challange02;

import java.util.Scanner;

public class Task06_IfStatement {

    /*
   Task->
   Girilen not değeri için
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz

     Girilen saat değeri için
	 	0 ~12 ==> good morning
		12 ~ 15 ==> good afternoon
		15 ~ 23 ==> good night
		12 ==> good noon
		print eden code create ediniz.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Aslanım  hele bir notunu gir baken : ");

        int aslanNotu = input.nextInt();
        if (aslanNotu >= 90 && aslanNotu <= 100) {//90,91,,,100
            System.out.println("A");

        } else if (aslanNotu >= 80 && aslanNotu < 90) {//80,81,,,89
            System.out.println("B");

        } else if (aslanNotu >= 70 && aslanNotu < 80) {//70,71,,,79
            System.out.println("C");

        } else if (aslanNotu >= 60 && aslanNotu < 70) {//60,61,,,69
            System.out.println("D");

        } else System.out.println("Aslanım Fener'in F'si hayırlı olsun seneye de bekleriz  :( ");//59,58,,,,

        System.out.println("Aslanım hele saatini  gir :");

        int aslanSaati = input.nextInt();
        if (aslanSaati >= 0 && aslanSaati < 12) {
            System.out.println("good morning");

        } else if (aslanSaati >12 && aslanSaati < 15) {
            System.out.println("good afternoon");

        } else if (aslanSaati >= 15 && aslanSaati < 23) {
            System.out.println("good night");

        } else
            System.out.println("Good noon");



    }


}

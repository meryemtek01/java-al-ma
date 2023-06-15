package halukh_taskÇalışma.tasks05Solutions.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi <= 999 && sayi >= 100) {
            System.out.println("Sayi 3 basamaklidir.");

        } else if (sayi <= 99 && sayi >= 10) {
            System.out.println("sayi 2 basamaklidir");
        } else {
            System.out.println("ikiside degil");

        }
    }
}

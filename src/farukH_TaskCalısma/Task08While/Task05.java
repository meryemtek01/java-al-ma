package farukH_TaskCalısma.Task08While;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz
		Örnek : isim = ali kale
		cıktı : A B C D E
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Ilk isminizi giriniz : ");
		char ilkHarf = scan.nextLine().toUpperCase().charAt(0);



		System.out.print("Soy isminizi giriniz : ");
		String soy = scan.nextLine().toUpperCase();


		char sonHarf = soy.charAt(soy.length()-1);
		if(ilkHarf<=sonHarf) {

			while(ilkHarf<=sonHarf) {
				System.out.print(ilkHarf + " ");
				ilkHarf++;
			}

		}else {

			while(sonHarf<=ilkHarf) {
				System.out.print(sonHarf + " ");
				sonHarf++;
			}
		}

	}

}

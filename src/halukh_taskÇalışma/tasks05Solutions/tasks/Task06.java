package halukh_taskÇalışma.tasks05Solutions.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("agam cinsiyetini giresen : ");
		String cnsyt= input.next();

		System.out.print("agam yasını giresen : ");
		int agaYası = input.nextInt();

		if (cnsyt.equals("erkek")) {//cinsiyetin erkek olma şartı
			if (agaYası <18) {//erkek yası 18'den küçük olma şartı
				System.out.println("Erkek çocuk");
			}else System.out.println("Adam");
		}else if (cnsyt.equals("kadın")){
			if (agaYası<18){//kadın yaşı 18den küçük olma şartı
				System.out.println("Kız Çocuğu");
			}else System.out.println("Kadın");
		}else System.out.println("agam bizimle eğlenirrrr  \nagam taksim delisi AYTA.... ");

		
	}
}
































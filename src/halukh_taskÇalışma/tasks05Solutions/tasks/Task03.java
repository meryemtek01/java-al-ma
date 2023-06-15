package halukh_taskÇalışma.tasks05Solutions.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner input = new Scanner(System.in);
        System.out.print("agam yıl giresen : ");
        int yil = input.nextInt();
        if (yil <=0) {//yılın negatif ve sıfır olma şartı
            System.out.println("agam gelmiyim oraya negatif yıl mı olur :( \n adam gibi bişeyler gir :");
        } else {
            if (yil % 1000 == 0) {//yılın 1000'e tam bolunme sartı
                System.out.println("milenyum");
            } else if (yil % 100 == 0) {//yılın 100'e tam bolunme kontrolu
                System.out.println("yüzyıl");
            } else if (yil % 10 == 0) {//yılın 10'a tam bolunme sartı
                System.out.println("onyıl");
            }
        }









        System.out.println("agam dewamkeee code gayet BAŞARILI :) ");
    }
}

	


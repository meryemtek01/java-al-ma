package halukh_taskÇalışma.tasks05Solutions.tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci kenar uzunlugunu girin");
        double a = scan.nextDouble();
        System.out.println("ikinci kenar uzunlugu");
        double b = scan.nextDouble();
        System.out.println("ucuncu kenar uzunlugunu grin");
        double c = scan.nextDouble();
        if (a == b && b == c) {
            System.out.println("eskenar ucgen");
        } else if (a == b || b == c || c == a) {
            System.out.println("ikizkenar");
        } else {
            System.out.println("cesitkenar");
        }

    }


}

package halukh_taskÇalışma.tasks06_SwitchCase;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D  0-4
		2. 50(dahil) ile 60 arası - C  5
		3. 60(dahil) ile 80 arası - B  6-7
		4. 80(dahil) ustu- A          8-10
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		 */

        Scanner input = new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        int not = input.nextInt();

        if (not>=0 && not <= 100) {
            not /= 10;

            switch (not) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Notunuz D");
                    break;
                case 5:
                    System.out.println("Notunuz C");
                    break;
                case 6:
                case 7:
                    System.out.println("Notunuz B");
                    break;
                case 8:
                case 9:
                case 10:
                    System.out.println("Notunuz A");
                    break;

            }

        } else
            System.out.println("Gecerli not giriniz");


    }


}

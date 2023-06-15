package halukh_taskÇalışma.tasks06_SwitchCase;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		 Kullanici ay ismini girdiginde o ayin kac cektigini ekrana yazan bir program yapiniz
		 */


        Scanner input = new Scanner(System.in);
        System.out.print("Hangi aydasınız: ");
        String ay = input.nextLine().toLowerCase();

        switch (ay) {
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralik":

                System.out.println("31 gun içerir.");
                break;

            case "nisan":
            case "haziran":
            case "eylul":
            case "kasim":
                System.out.println("30 gun içerir.");
                break;

            case "subat":
                System.out.print("Hangi yıldasınız giriniz:");
                int yil = input.nextInt();

                if (yil%4==0 && yil%100!=0 || yil%400==0) {
                    System.out.println(yil + "  29 gun icerir");
                } else
                    System.out.println("28 gun içerir.");
                break;
        }


    }

}

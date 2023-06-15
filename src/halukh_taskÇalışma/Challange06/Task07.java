package halukh_taskÇalışma.Challange06;

import java.util.Scanner;

public class Task07 {


    // Task-> Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sey giriniz");
        String c = input.nextLine();
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == 'a' || c.charAt(i) == ' ') {
                continue;

            }
            System.out.print(c.charAt(i));
        }
    }

}

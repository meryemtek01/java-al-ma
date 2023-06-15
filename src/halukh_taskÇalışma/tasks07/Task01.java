package halukh_taskÇalışma.tasks07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("String i yazınız : ");
        String str = scan.nextLine();

        if (str.contains(" ")) System.out.println("boşluk var");
        else System.out.println("boşluk yok");
    }
}


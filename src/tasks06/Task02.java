package tasks06;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı
        Scanner input=new Scanner(System.in);
        System.out.println("pazartesi\n sali\ncarşamba");
        System.out.println("kaçınci gündesiniz =");

        int gün=input.nextInt();
        gün=(gün+100)%7;
        switch (gün) {
            case 1:
                System.out.println("pazartesi");
                break;


        }


    }
}


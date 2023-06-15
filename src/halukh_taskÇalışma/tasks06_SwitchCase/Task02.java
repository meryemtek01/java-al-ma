package halukh_taskÇalışma.tasks06_SwitchCase;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner input=new Scanner(System.in);
        System.out.println("Kaçıncı gündesiniz ");
        System.out.print("Pazartesi:1\nSalı:2\nCarsamba:3\nPersembe:4\nCuma:5\nCumartesi:6\nPazar:7\nHangi gündesiniz: ");
        int gun=input.nextInt();

        gun=(gun+100)%7;

        System.out.print("100 gun sonraki gun: ");
        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 0:
                System.out.println("Pazar");
                break;
        }

    }
}


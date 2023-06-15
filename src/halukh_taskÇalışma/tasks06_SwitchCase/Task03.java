package halukh_taskÇalışma.tasks06_SwitchCase;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız.
        // 1.gün Pazartesi olsun

        Scanner input=new Scanner(System.in);
        System.out.print("Kaçıncı gündesiniz: ");
        int gun=input.nextInt();

        System.out.print(gun+". gun: ");
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
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("hatalı giriş");
        }




    }
}

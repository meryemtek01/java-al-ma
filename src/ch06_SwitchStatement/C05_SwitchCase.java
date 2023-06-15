package ch06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // girilen ayın hangi mevsimde oldugunu print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("Ay giriniz ");
        int ay = input.nextInt();
        switch (ay) {
            default:
                System.out.println("dogru bir ay numarası giriniz 1 12 arası");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("kış mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar mevsimi");
                break;
        }
    }
}

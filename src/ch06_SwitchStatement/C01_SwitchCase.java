package ch06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("rakam gir ");
        int rakam = input.nextInt();
       switch (rakam) {
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;

            case 2:
                System.out.println("iki");
                break;
            default:
                System.out.println("wrong choise");
        }
    }
}

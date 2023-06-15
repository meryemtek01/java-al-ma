package ch06_SwitchStatement;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        //task: girilen haftanın gününü hafta içi veya sonu olduğunu print eden code creat ediniz..

        Scanner input = new Scanner(System.in);
        System.out.println( " gün ismi giriniz ");
        String gun =input.nextLine().toUpperCase();//ne girerse girsin büyük harfe çevirir
        System.out.println( "gün= "+gun);
        switch (gun) {
            case "PAZARTESİ":
            case "SALI":
            case "ÇARŞAMBA":
            case "PERŞEMBE":
            case "CUMA":
                System.out.println("hafta içi");
                break;
            case "CUMARTESİ":
            case "PAZAR":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("yanlış giriş");

        }
    }
}

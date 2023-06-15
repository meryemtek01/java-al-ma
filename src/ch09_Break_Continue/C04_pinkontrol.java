package ch09_Break_Continue;

import java.util.Scanner;

public class C04_pinkontrol {
    public static void main(String[] args) {

        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);
        String sifre = "1234.abs";
        int girishakki=3;
        while (true){//
            System.out.println("bir Pin giriniz");
            String pin = input.nextLine();
            if (sifre.equals(pin)){
                System.out.println(" şifre eşleşti ");
                break;
            }else {
                System.out.println("şifre yanlış tekrar dene");
                girishakki--;
                System.out.println("kalan deneme hakkın  "+girishakki );
                if (girishakki==0){
                    System.out.println("bloke oldun");
                    break;
                }
            }



        }
    }
}

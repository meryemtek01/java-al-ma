package ch26_exception;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

 /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
 */

        Scanner input = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz: ");
        String password = input.nextLine();
       try{

        if (password.length() < 6 || password.length() > 10) {
            throw new StringIndexOutOfBoundsException("Şifre 6 ile 10 karakter arasında olmalıdır.");


        }else  System.out.println("Girilen şifre geçerli.");


       }catch (StringIndexOutOfBoundsException e){
           System.out.println("e = " + e);
           System.out.println("catch block çalıştı");
       }
        System.out.println("sistem calışıyor");
       //try catch kullanmaktaki maksat exception ı kontrollü fırlatıp, akışı devam ettirmek
        //Kodun akışında başka şeyler de var. O hatadan bağımsız kod çalışsın istiyoruz

    }




}

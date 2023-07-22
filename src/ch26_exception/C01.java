package ch26_exception;

import java.util.Scanner;
/*
1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz catch block, try
block exception  yakalarsa calışır
2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch
block tanımlanabilir.
   aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
 */
public class C01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayi1 = input.nextInt();

        System.out.println("2. sayıyı giriniz");
        int sayi2 = input.nextInt();
        //   int sonnuc = sayi1 / sayi2;
        System.out.println("uygulama calışmaya devam ediyor");
        try {
            /*
try - catch içinde yapılna işlemlerden sonra mutlaka çalışması gerekn block vatsa finally tanımlanır.
ama finaly tanımlanırsa catch çalışmasa bile
pr akışı devam eder.finally block hata olsa da olmasa da calışır.
Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
 */
            int sonnuc = sayi1 / sayi2;
            System.out.println("sonnuc = " + sonnuc);
            System.out.println("try block içerisinden geliyor");
        }catch (StringIndexOutOfBoundsException ex){
            //throw new RuntimeException(e);
            System.out.println("StringIndexOutOfBoundsException ex");
            System.out.println("ex.getMessage() = " + ex.getMessage());

        }

        catch (ArithmeticException e){

            System.out.println("ArithmeticException sayı sıfıra bolunmez");
        }

        catch  (Exception e){
            System.out.println("Exception  eger bir Exception  varsa yukarıdakiler disinda calısarak yer burası");


        }

        finally {
            System.out.println("finally ");

            /*
try - catch içinde yapılna işlemlerden sonra mutlaka çalışması gerekn block vatsa finally tanımlanır.
ama finaly tanımlanırsa catch çalışmasa bile
pr akışı devam eder.finally block hata olsa da olmasa da calışır.
Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
 */
        }
        System.out.println("class in son kodu bakalım konsolda görecekmiyiz");
    }


}

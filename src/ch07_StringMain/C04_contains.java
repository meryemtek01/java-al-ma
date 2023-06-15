package ch07_StringMain;

import java.util.Scanner;
import java.util.SortedSet;

public class C04_contains {
    public static void main(String[] args) {
        /*
String icersinde istenen stringin varlığını kontrol eder boolean return eder..

 */
        String str="java ile gunler";
        System.out.println("str="+str);

        //CTE  System.out.println("str.contains('java'="+str.contains('j'));
        System.out.println("str.contains(\"java\")="+str.contains("java"));//str.contains("java")=true


        System.out.println("str.contains(\"Java\")="+str.contains("Java"));//str.contains("Java")=false


        System.out.println("str.contains(\" \")="+str.contains(" "));//str.contains(" ")=true

        System.out.println("str.contains(\"\")="+str.contains(""));//str.contains("")=true

        System.out.println("\"\".length() "+"".length());//"".length() 0
// task-> girilen uruunun var olup olmaidginiz kontrol eden bir code create ediniz -> ternary kullanınız

        String buzdolabi="elma peynir yumurta zeytin bal kaymak";
              Scanner input=  new Scanner(System.in);

        System.out.println("ürün gir  ");
        String urun=input.nextLine();
        String result=buzdolabi.contains(urun) ? "evet urun dolap ta var":"bu urun dolap da yok";
        System.out.println("result="+result);

        //TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
// ternary ile switch ile if ile yapiniz
//bug i bulunuz
//contains methodu sifre kontrol islemlerinde KULLANILMAMALI
    String password="123456";
        System.out.println("şifreni gir");
        String sifre=input.nextLine();
        if (sifre.contains(password)){ //şart sağlanırsa true ise
            System.out.println("you can log in");

        }else System.out.println("you can not log in");
        //burada ki Bug ı bulunuz
        //+ - karakter girildiginde de kabul eder
        //1  girsem  erişim sağlarım
        //1234567890 olarak girersem de sifreyi kabul eder ama contains old için
  String result2=sifre.contains(password) ? "you can log in with ternary  " : "bye bye  happeness";

        System.out.println("result2:"+result2);
        switch (sifre){
            case "123456":
                System.out.println("you can log in via switch case");
                break;
            default:
                System.out.println("you entered wrong value");
                break;
        }

    }
}

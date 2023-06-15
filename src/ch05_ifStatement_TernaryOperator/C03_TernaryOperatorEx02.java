package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperatorEx02 {
    public static <object> void main(String[] args) {
        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
//           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
//           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

        int d = -1;

        int abs = d > 0 ? (-1 * d) : (d);
        System.out.println("abs" + abs);
        System.out.println("math.abs(d)"+Math.abs(d));
        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, // return type int
// farkli isaretli ise "Islem yapamam" mesaji veriniz             //return type String
   int e=12;
   int f=23;
      Object obj=  (e>0 && f>0)|| (e<0 && f<0 ) ? (e*f) : "Islem yapamam";
       //eger sartlar iki farklı deger return ediyorsa atamayı parent class dan yapmak gerekir
        System.out.println("obj="+obj);

        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı  giriniz:");
        int sayi= input.nextInt();

        String result= sayi % 2==0 ? "çift sayı" : "tek sayı";
        System.out.println("result="+result);


    }
}

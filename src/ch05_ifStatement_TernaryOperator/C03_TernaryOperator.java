package ch05_ifStatement_TernaryOperator;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz
      int a=3;
      if(a>0) {
          System.out.println("sayı pozitif");
      }else {
          System.out.println("sayı negatif");

      }
      //ternary ile
       //CTE atama yapmak lazım a>0 ?"pozitif"; not a statement
        String sonuc=a>0 ? "pozitif" : "negatif";
        System.out.println(sonuc);
//atama yapmdan nasıl kullanılır
        System.out.println("atama yapmadan sonuç");
        System.out.println(a>0 ? "pozitif" : "negatif");
    }
}

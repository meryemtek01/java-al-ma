package ch05_ifStatement_TernaryOperator;

public class C03_TernaryOperatorEx01 {
    public static void main(String[] args) {
        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz ternary kullaniniz
  int i = 23;
  int j = 53;
  int min= i>j ? i : j;
        System.out.println("min sayı="+min);
        System.out.println(i<j ? "min"+i  : "min"+j);

    }
}

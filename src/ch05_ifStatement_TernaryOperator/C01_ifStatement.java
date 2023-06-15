package ch05_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {


        int yasmeryem = 35;
        int yasAhmet = 34;
        if (yasmeryem == yasAhmet) {//meryem ve ahmedin yasları birbirine eşit mi? eşit se bu if çalışır değilse çalışmaz
            System.out.println("aynı yaşdasınız");

        }
        if (yasmeryem>40) {System.out.println("yasi 40 dan büyük");
        }
        if (yasmeryem+yasAhmet>50)
            System.out.println("ikisinin yaşı 50 den büyüktür");
        //if else blocklarında herzaman {} parantez olmayabilir
    // if in scope u ilknoktalı virgüle kadardır
    }
}

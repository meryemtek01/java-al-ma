package ch08_Loops.L02_WhileL00p;

public class C01_whileLoop {
    public static void main(String[] args) {
// task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...

        System.out.println("*****for ile çözüm  ****");
        for (int i = 11; i <= 20; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("*****While ile çözüm  ****");
        int sayi = 11;//başlangic degeri belirlendi
        while (sayi < 21) {//20 olana kadar çalışması kontrol edildi
            System.out.print(sayi + " ");
            sayi++;//sonsuz olmaması için sauı arttırıldı
        }
        System.out.println();
//task02-> 7 kere javaCAN print eden code create ediniz...

        int n = 1;
        while (n <= 7) {
            System.out.println("Javacan " + n);
            n++;
        }
        System.out.println();
        // task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz

        int s = 11;
        while (s <= 100) {
            if (s % 2 == 0) {
                System.out.print(s + " ");
                s++;
            }
        }
        System.out.println("hocanın yaptıbı task3");
        int task3count = 11;
        while (task3count < 100){
            if (task3count % 2 == 0) {
                System.out.println(task3count + " ");
                task3count++;
            }  }
    }
    }




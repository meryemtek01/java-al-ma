package halukh_taskÇalışma.Challange02;

public class Task03_IncrementDecrement {
    public static void main(String[] args) {
    /*
      Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
      Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
     */
        System.out.println("   ***   Arttirma   ***   ");
        int a = 1;

        System.out.println("++a = " + ++a);// 2 -> önce artır sonra mevcut değeri bas
        System.out.println("a++ = " + a++);// 2 -> önce mevcut değeri bas sonra arttır
        System.out.println("a = " + a);// 3 -> mevcut değeri bas

        int b = 5;
        System.out.println("--b = " + --b);// 4
        System.out.println("b-- = " + b--);//4
        System.out.println("b = " + b);//4
        System.out.println("   ***   Task   ***   ");

        int x=20;
        int y=15;


        System.out.println("++x+y-- = " + (++x + y--));// 36
        System.out.println("x = " + x);// 21
        System.out.println("y = " + y);// 14

        System.out.println("++x+y-- = " + (++x + y--));// 35
        System.out.println("x = " + x);// 22
        System.out.println("y = " + y);// 13

        int k=7;
        System.out.println("++k+k+++k+++--k+k--+k = " + (++k + k++ + k++ + --k + k-- + k));// 51
        System.out.println("k = " + k);// 6
    }
}

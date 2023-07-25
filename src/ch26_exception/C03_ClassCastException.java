package ch26_exception;

public class C03_ClassCastException {
    public static void main(String[] args) {
        // ClassCastException -> Biribirne dönüştürülemeyen data type'lar biribirine dönüştürüldüğünde oluşan
// RTE Exception dur
        Object obj="javadan sudan konusuyoruzu";
        String str=(String) obj;
        System.out.println("str = " + str);
        Object sayi=10;
      //  String str2= (String) sayi;

      // RTE  System.out.println("str2 = " + str2);
        //Exception in thread "main" java.lang.
       try {
           String str2= (String) sayi;
       }catch (ClassCastException e) {
           System.out.println("integer deger String e cast edilemez");
        }
        try {
            String str3= (String) sayi;
            System.out.println("bu kodu okuduysan kod htasız çalışmış demektir");
        }catch (ClassCastException e) {
            System.out.println("cast işlemi basarısız oldu");
        }
        System.out.println("bu kod calısır mı");
    }
}

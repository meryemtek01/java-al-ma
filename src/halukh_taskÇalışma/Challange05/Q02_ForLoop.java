package halukh_taskÇalışma.Challange05;

public class Q02_ForLoop {
    //Interview Question
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {
        System.out.println("****For ile**");

        for (int i = 0; i <= 255; i++) {
            char karakter = (char) i;  //döngüden gelen herbir i tamsayın ascii değeri karaktere atndı
            System.out.println(i + " i nin karakter degeri >>" + karakter);
        }

        System.out.println("** *While ile ***");
        int a = 1;
        while (a <= 255) {

           char c = (char) a;
           a++;
           System.out.println(a + " a nin karakter degeri >>" + c);
       }

        System.out.println("** * Do While ile ***");

     //   do {
        //    char d = (char) a;
        //    System.out.println(a + " a nin karakter degeri >>" + c);

        //    a++;
      //  } while (a <= 255);


    }//main sonu
}
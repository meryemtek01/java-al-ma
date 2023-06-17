package farukH_TaskCalısma.task10Methots;

public class Task13 {

    public static void main(String[] args) {

    /*
    Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true,
    diğer durumda false return eden METHOD create ediniz

    Örnekler:
   ("abc", "bc") ➞ true
   ("abc", "d") ➞ false
   ("samurai", "zi") ➞ false
   ("feminine", "nine") ➞ true
   ("convention", "tio") ➞ false
    */

        String x="feminine";
        String y="nine";
        String z="tio";

        kontrolEt(x,y,z);

    }

    public static void kontrolEt(String x, String y, String z) {
        System.out.println(x.endsWith(y));
        System.out.println(x.endsWith(z));

    }



    }

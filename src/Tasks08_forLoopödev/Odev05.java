package Tasks08_forLoopödev;

public class Odev05 {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

        for (int i = 1; i < 100; i++) {
            if (i%2 !=0 ) {
                System.out.println(i+" sayı tek sayıdır");
            }
        }

    }
}
